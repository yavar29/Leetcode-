class Solution {
public boolean checkPossibility(int[] nums) {
    for(int i=1;i<nums.length;i++)
    {
        if(nums[i]<nums[i-1]) 
        { 
            if(i==nums.length-1) 
                nums[i]=nums[i-1];
                   
            else if(nums[i-1]<=nums[i+1])
            {  
                nums[i]=nums[i-1];
                break;
            }
            
            else if(nums[i-1]>nums[i+1])
            {  
                nums[i-1]=nums[i];
                break;
            }
        }
    }
    for(int i=1;i<nums.length;i++)
        if(nums[i]<nums[i-1]) 
            return false;
    return true;
}
}