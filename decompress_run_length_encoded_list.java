class Solution {
    public int[] decompressRLElist(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i=i+2){
            sum=sum+nums[i];
        }
        int arr[]=new int[sum];
        int k=0;
        for(int i=0;i<nums.length;i=i+2){
            while(nums[i]-- >0){
                arr[k++]=nums[i+1];
            }
        }
        return arr;
    }
}