class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        HashMap<Integer, Boolean> hashTable = new HashMap<Integer, Boolean>();
        List<Integer> result = new ArrayList<Integer>();
        
        for (int i = 0; i < nums.length; i++) 
            hashTable.put(nums[i], true);
        
        for (int i = 1; i <= nums.length; i++) {
            if (!hashTable.containsKey(i)) {
                result.add(i);
            }
        }
        return result;
    }
}