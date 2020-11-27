class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new HashSet<>();
        
        for (int num : nums) 
            set.add(num);
        
        if (set.size() < 3) {
            return Collections.max(set);
        }
        
        int max1=Collections.max(set);
        set.remove(max1);
        
        int max2=Collections.max(set);
        set.remove(max2);
        
        return Collections.max(set);
                   
    }
}