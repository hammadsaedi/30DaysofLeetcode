class Solution {
    public String mergeAlternately(String s1, String s2) {
        StringBuilder builder = new StringBuilder();
        int i = 0;
        while(i < s1.length() && i < s2.length()){
            builder.append(s1.charAt(i));
            builder.append(s2.charAt(i));
            i++;
        }

        while(i < s1.length()){
            builder.append(s1.charAt(i));
            i++;
        }

        while(i < s2.length()){
            builder.append(s2.charAt(i));
            i++;
        }

        return builder.toString();
    }
}