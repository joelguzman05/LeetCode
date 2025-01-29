

class Solution {
    public int climbStairs(int n) {
        int n1 = 1, n2 = 1;
        for (int i = 1; i < n; i++) {
            int aux = n1 + n2;
            n1 = n2;
            n2 = aux;
        }
        return n2;
    }
}