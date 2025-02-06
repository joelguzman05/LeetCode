class Solution {
    public int trap(int[] height) {
        int trapWatter = 0;
        int l = 0, r = height.length - 1;
        int maxL = height[l], maxR = height[r];
        while (l < r) {
            if (maxL > maxR) {
                r--;
                maxR = Integer.max(maxR, height[r]);
                trapWatter += maxR - height[r];
            } else {
                l++;
                maxL = Integer.max(maxL, height[l]);
                trapWatter += maxL - height[l];
            }
        }
        return trapWatter;
    }
}