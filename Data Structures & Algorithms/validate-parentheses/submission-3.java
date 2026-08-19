class Solution {
    public boolean isValid(String s) {
    
       Deque<Character> stack = new ArrayDeque<>();
       
       for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else {
                if (stack.isEmpty()) {
    return false;
}
                char top = stack.peek();
                if(top == '(' && currentChar == ')') {
                    stack.pop();
                } else
                if(top == '{' && currentChar == '}') {
                    stack.pop();
                }
                else if(top == '[' && currentChar == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
       }
       
       return stack.isEmpty();
    }
}
