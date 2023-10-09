class Solution {
    public int romanToInt(String s) {
        Stack<Integer> stack = new Stack<>();
    Map<Character, Integer> romanMap = new HashMap<>();
    romanMap.put('I', 1);
    romanMap.put('V', 5);
    romanMap.put('X', 10);
    romanMap.put('L', 50);
    romanMap.put('C', 100);
    romanMap.put('D', 500);
    romanMap.put('M', 1000);

    for (int i = 0; i < s.length(); i++) {
        char currentChar = s.charAt(i);

        if (!stack.isEmpty() && stack.peek() < romanMap.get(currentChar)) {
            stack.push(romanMap.get(currentChar) - stack.pop());
        } else {
            stack.push(romanMap.get(currentChar));
        }
    }


    int result = 0;
    while (!stack.isEmpty()) {
        result += stack.pop();
    }

    return result;
    }
}