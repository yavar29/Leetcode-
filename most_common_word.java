class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map= new HashMap<>();
        
        String p= paragraph.toLowerCase().replaceAll("\\p{Punct}"," ");
        
        String[] words = p.split(" ");
        
        //System.out.println(p);
        
        for(int i=0;i<words.length; i++){
            String a=words[i];
            if(!map.containsKey(a)){
                map.put(a, 1);
            }
            else{
                map.put(a, map.get(a)+1);
            }
        }
        
        System.out.println(map);
        for(String x : banned){
            if(map.containsKey(""))
                map.remove("");
            if(map.containsKey(x)){
                map.remove(x);
            }
        }
        
        int max=Collections.max(map.values());
        String ans=null;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() == max){
                ans= entry.getKey();
            }
        }
        
        return ans;
    }
}