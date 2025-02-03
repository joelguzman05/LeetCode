

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        @SuppressWarnings("unchecked")
        List<Integer>[] freq = new List[nums.length + 1];
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        count.forEach((key, value) -> freq[value].add(key));

        int[] res = new int[k];
        int j = 0;
        for (int i = freq.length - 1; i >= 0; i--) {
            for (Integer n : freq[i]) {
                res[j++] = n;
                if (j == k) {
                    return res;
                }
            }
        }
        return res;
    }
}