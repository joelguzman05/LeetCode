class Solution {
    List<List<Integer>> sets = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtracking(0, new ArrayList<>(), nums);
        return sets;

    }

    public void backtracking(int i, List<Integer> subSet, int[] nums) {
        if (i == nums.length) {
            sets.add(new ArrayList<>(subSet));
            return;
        }
        subSet.add(nums[i]);
        backtracking(i + 1, subSet, nums);
        subSet.removeLast();
        backtracking(i + 1, subSet, nums);
    }
}