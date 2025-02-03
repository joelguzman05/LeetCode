

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);

        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int postfix = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            postfix *= nums[i + 1];
            res[i] *= postfix;
        }
        return res;
    }
}