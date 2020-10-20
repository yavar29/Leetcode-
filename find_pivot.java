class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0; i< nums.length;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        
        int left=0;
        
        for(int i=0; i< nums.length; i++){
            int right= nums[nums.length -1] - nums[i];
            if(left==right)
                return i;
            
            left = nums[i];
        }
        return -1;
    }
}