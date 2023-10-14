class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while(start < end){
            if(isVowel(chars[start]) && isVowel(chars[end])){
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            } else if(!isVowel(chars[start])) {
                start++;
            } else {
                end--;
            }
        }
        System.gc();
        return new String(chars);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); 
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}