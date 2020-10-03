class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char x= s.charAt(i);
            if(map.containsKey(x))
                map.put(x, map.get(x) + 1);
            else
                map.put(x, 1);
        }
        System.out.println(map);
        
        for(int i=0; i <t.length(); i++){
            char y = t.charAt(i);
            if(map.containsKey(y))
                map.put(y, map.get(y) - 1);
        }
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()==0)
                map.remove(entry.getKey());
        } 
        
        System.out.println(map);
        
        return false;
        
        
        /*char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1, t1);
        */
    }
}