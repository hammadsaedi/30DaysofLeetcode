class Solution {
    private final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] TENS = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        StringBuffer sb = new StringBuffer();
        if (num >= 1000000000) {
            int temp = num / 1000000000;
            sb.append(numberToWords(temp) + " Billion ");
            num = num % 1000000000;
        }
        if (num >= 1000000) {
            int temp = num / 1000000;
            sb.append(numberToWords(temp) + " Million ");
            num = num % 1000000;
        }
        if (num >= 1000) {
            int temp = num / 1000;
            sb.append(numberToWords(temp) + " Thousand ");
            num = num % 1000;
        }
        if (num >= 100) {
            int temp = num / 100;
            sb.append(LESS_THAN_20[temp] + " Hundred ");
            num = num % 100;
        }
        if (num >= 20) {
            int temp = num / 10;
            sb.append(TENS[temp] + " ");
            num = num % 10;
        }
        if (num > 0) {
            sb.append(LESS_THAN_20[num]);
        }

        return sb.toString().trim();
    }
}
