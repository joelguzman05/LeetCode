class Solution {

    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                char element = board[r][c];
                if (element == '.') {
                    continue;
                }
                String keySquare = (r / 3) + "," + (c / 3);

                if (rows.computeIfAbsent(r, v -> new HashSet<>()).contains(element) ||
                        cols.computeIfAbsent(c, v -> new HashSet<>()).contains(element) ||
                        squares.computeIfAbsent(keySquare, v -> new HashSet<>()).contains(element)) {
                    return false;
                }
                rows.get(r).add(element);
                cols.get(c).add(element);
                squares.get(keySquare).add(element);
            }
        }
        return true;
    }
}