class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> stack =new Stack<>();
        for(int i=0; i< S.length();i++){
            if(!stack.isEmpty() && S.charAt(i)==stack.peek()){
                stack.pop(); 
            }
            else
                stack.add(S.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        
        Iterator x=stack.iterator();
        
        while(x.hasNext()){
            sb.append(x.next());
        }
        
        return sb.toString();
        
        /*
        while(!stack.isEmpty())
            sb.append(stack.pop());
        
        return sb.reverse().toString();
        */
    }
}