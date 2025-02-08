class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxRectangleArea =0;
        Stack<int[]> stackBars = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            int start = i;
            while (!stackBars.isEmpty() && stackBars.peek()[0] > heights[i]) {
                int[] bar = stackBars.pop();
                maxRectangleArea = Integer.max(maxRectangleArea, (i - bar[1]) * bar[0]);
                start = bar[1];
            }
            stackBars.push(new int[]{heights[i], start});
        }
        while (!stackBars.isEmpty()) {
            int[] bar = stackBars.pop();
            maxRectangleArea = Integer.max(maxRectangleArea, (heights.length - bar[1]) * bar[0]);
        }
        return maxRectangleArea;
    }
}