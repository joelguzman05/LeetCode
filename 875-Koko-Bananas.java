class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 0;
        int r = Arrays.stream(piles).max().getAsInt();
        while (l < r) {
            int m = (l + r) / 2;
            double time = 0;
            for (int p: piles) {
                time += Math.ceil((double) p / m);
            }
            if (time <= h) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return r;
    }
}