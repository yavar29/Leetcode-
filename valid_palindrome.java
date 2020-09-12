class Solution {
    public boolean isPalindrome(String s) {
        String valid="";
        
        String s1= s.replaceAll("\\p{Punct}", " ").toLowerCase();
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=' ')
                valid+=s1.charAt(i);
            else
                continue;
        }
        int n=valid.length();
        
        for(int i=0; i<n; i++){
            if(valid.charAt(i) != valid.charAt(n -1 - i))
                return false;
        }
        return true;
    }
}