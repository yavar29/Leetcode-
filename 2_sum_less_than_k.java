class Solution {
    public int twoSumLessThanK(int[] A, int K) {
        Arrays.sort(A);
        int sum=-1;
        
        int left=0;
        int right=A.length -1;
        
        while(left<right){
            int temp_sum=A[left]+A[right];
           
            if(temp_sum<K){
                sum=Math.max(sum,temp_sum);
                left++;
            }
            else
                right --;
        }
        return sum;
    }
}