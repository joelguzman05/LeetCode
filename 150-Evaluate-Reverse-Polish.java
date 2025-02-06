class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
        for (String t : tokens) {
            if (("+-*/").contains(t)) {
                int num1 = numbers.pop();
                int num2 = numbers.pop();
                switch (t) {
                    case "+" -> numbers.add(num2 + num1);
                    case "-" -> numbers.add(num2 - num1);
                    case "*" -> numbers.add(num2 * num1);
                    default -> numbers.add(num2 / num1);
                }
            } else {
                numbers.add(Integer.parseInt(t));
            }
        }
        return numbers.peek();
    }
}