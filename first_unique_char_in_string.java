class Solution {
    public int firstUniqChar(String s) {
        char[] arr=s.toCharArray();
        Map<Character, Integer> count=new HashMap<Character,Integer>();
    
        for(int i=0;i<arr.length;i++){
            if(count.containsKey(arr[i])){
                count.put(arr[i], count.get(arr[i])+1);
            }
            else{
                count.put(arr[i],1);
            }
        }
        for(int i=0; i<arr.length; i++){
            if(count.get(arr[i])==1)
                    return i;
        }
        return -1;
    }
}