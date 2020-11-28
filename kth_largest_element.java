class Solution {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        for(int num: nums)
        {
            list.add(num);
            if(list.size() > k){
                list.remove(Collections.min(list));
            }
        }
        
        if(list.size()<k)
           return -1;
        
        return Collections.min(list);
    }
}