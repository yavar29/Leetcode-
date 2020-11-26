class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] array = new int[2*n];
        int counter = 0;
        for(int i = 0; i< n; i++){
            array[counter++] = nums[i];
            array[counter++] = nums[i+n];
        }
        return array;
    }
}