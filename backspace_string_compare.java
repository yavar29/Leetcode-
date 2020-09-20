class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> answer1= new Stack();
        Stack<Character> answer2=new Stack(); 
        boolean result;
       
        for(char c: S.toCharArray()){
            if(c != '#'){
                answer1.push(c);
            }
            else if(!answer1.empty()){
                answer1.pop();
            }
        }
        
        for(char y: T.toCharArray()){
            if(y != '#'){
                answer2.push(y);
            }
            else if(!answer2.empty()){
                answer2.pop();
            }
        }
        if(answer1.equals(answer2))
                result=true;
        else
                result=false;
        
        return result;
        
    }
}