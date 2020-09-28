class Solution {
    public boolean isValid(String s) {
    
        Stack<Character> stack= new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c=='{' || c=='(' || c=='[')
                stack.add(c);
            
            if(c=='}'){
                if(stack.isEmpty() || stack.peek() != '{')
                    return false;
                else
                    stack.pop();
            }
            
            if(c==']'){
                if(stack.isEmpty() || stack.peek() != '[')
                    return false;
                else
                    stack.pop();
            }
            
            if(c==')'){
                if(stack.isEmpty() || stack.peek() != '(')
                    return false;
                else
                    stack.pop();
            }
        }
        
        return stack.isEmpty();
    }
}