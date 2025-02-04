class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }

        int maxSequence = 0;
        for (int n: numsSet) {
            if (numsSet.contains(n - 1)) continue;
            int currSequence = 1;
            while (numsSet.contains(n + currSequence)) {
                currSequence++;
            }
            maxSequence = Integer.max(maxSequence, currSequence);
        }
        return maxSequence;
    }
}