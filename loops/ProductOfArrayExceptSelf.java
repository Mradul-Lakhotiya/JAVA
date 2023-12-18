// https://leetcode.com/problems/product-of-array-except-self/
// This solution is not optimized


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = 1;
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                }
                else {
                    ans[i] *= nums[j];
                }
            }
        }
        return ans;
    }
}