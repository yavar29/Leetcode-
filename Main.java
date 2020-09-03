package com.company.leetcode;

public class Main {

    public static void main(String[] args) {
        int[] arr={2,3,4,5,7};
        Solution obj= new Solution();
        System.out.println(obj.missingNumber(arr));
    }
    public static class Solution {
        public int missingNumber(int[] arr) {

            int sum = 0;
            int totalElements = arr.length;

            int arithmeticProgressionSum = ((totalElements + 1) * (arr[0] + arr[totalElements - 1])) / 2;

            for(int num: arr) {
                sum += num;
            }
            return arithmeticProgressionSum - sum;
        }
    }
}
