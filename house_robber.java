class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int sum1 =0;
        int sum2=0;
        int s1=0;
        int s2=0;
        
        if(nums.length%2==0 && nums.length == 4){
            for(int i=0; i<nums.length - 1; i+=2){
                s1=s1+ nums[i];
                s2=s2+ nums[i+1];
            }
            int k= nums[0] + nums[3];
            if(k> s1 && k> s2)
                return k;
        }
        
        if(nums.length%2==0){
            for(int i=0; i<nums.length - 1; i+=2){
                sum1=sum1+ nums[i];
                sum2=sum2+ nums[i+1];
            }
        }
        else{
            sum1= nums[0];
            for(int i=1; i<nums.length - 1; i+=2){
                sum1= sum1 + nums[i + 1];
                sum2= sum2 + nums[i];
            }
        }

        if(nums.length == 4){
            return Math.max(s1, s2);
        }
        if(sum1> sum2 || sum1 == sum2)
            return sum1;
        else
            return sum2;
    }
}