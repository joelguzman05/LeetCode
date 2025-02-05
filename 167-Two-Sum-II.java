class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int currSum = numbers[l] + numbers[r];
            if (currSum == target) {
                return new int[]{l + 1, r + 1};
            } else if (currSum < target) {
                l++;
            } else {
                r--;
            }
        }
        return null;
    }
}