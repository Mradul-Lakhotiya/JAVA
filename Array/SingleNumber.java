// https://leetcode.com/problems/single-number/
// This Solution is optimal solution

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
        }

        for (int i = 0; i < nums.length; i++) {
            int value = freq.get(nums[i]);
            if (value == 1) {
                return nums[i];
            }
        }
        return -1;
    }
}