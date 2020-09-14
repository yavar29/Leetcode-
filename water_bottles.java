class Solution {


    public int numWaterBottles(int numBottles, int numExchange) {
        int numEmpty=0;
        int count= numBottles;
        while(numBottles + numEmpty >= numExchange){
            
            int sum= numBottles + numEmpty;
            numBottles = sum / numExchange;
            numEmpty = sum % numExchange;
            count+= numBottles; 
        }
        return count;
    }
}