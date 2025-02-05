class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int l = 0, r = height.length - 1;
        while (l < r) {
            int base = r - l;
            int minHeight = Integer.min(height[l], height[r]);
            maxWater = Integer.max(maxWater, base * minHeight);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxWater;
    }
}