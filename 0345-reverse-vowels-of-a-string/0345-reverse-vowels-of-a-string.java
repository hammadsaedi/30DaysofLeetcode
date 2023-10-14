class Solution {
    public String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(isVowel(c))
                stack.push(c);
        }
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(isVowel(c))
                c = stack.pop();
            builder.append(c);
        }
        System.gc();
        return builder.toString();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); 
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}