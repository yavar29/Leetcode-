class Solution {
    public int minStartValue(int[] nums) {
        int sum=0;
        int start=1;
        
        for(int i=0; i< nums.length; i++){
            sum=sum+ nums[i];
            if(sum<1){
                start=start+ Math.abs(sum);
                sum=0;
            }
        }
        return start;
    }
}