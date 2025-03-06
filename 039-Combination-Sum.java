class Solution {

    List<List<Integer>> sets = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtracking(0, 0, new ArrayList<>(), candidates, target);
        return sets;
    }

    public void backtracking(int i, int sum, List<Integer> subSet, int[] candidates, int target) {
        if (sum == target) {
            sets.add(new ArrayList<>(subSet));
            return;
        }
        if (sum > target || i == candidates.length) {
            return;
        }
        subSet.add(candidates[i]);
        backtracking(i, sum + candidates[i], subSet, candidates, target);
        subSet.removeLast();
        backtracking(i + 1, sum, subSet, candidates, target);
    }
}