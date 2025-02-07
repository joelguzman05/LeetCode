class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stackTemp = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stackTemp.isEmpty() && stackTemp.peek()[0] < temperatures[i]) {
                int[] lastTemp = stackTemp.pop();
                res[lastTemp[1]] = i - lastTemp[1];
            }
            stackTemp.push(new int[]{temperatures[i], i});
        }
        return res;
    }
}