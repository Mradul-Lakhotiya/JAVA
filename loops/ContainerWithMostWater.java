// https://leetcode.com/problems/container-with-most-water/
// This solution is not optimized


class Solution {
    public int maxArea(int[] height) {
        int max = 0, min = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                min = (int)Math.min(height[i], height[j]);
                max = (int)Math.max(max, Math.abs(i-j)*min);
            }
        }

        return max;
    }
}