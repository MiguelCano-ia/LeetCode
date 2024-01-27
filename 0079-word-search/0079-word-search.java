class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean result = search(board, word, i, j, 0);
                    if (result) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    boolean search(char[][] board, String word, int r, int c, int index) {
        if (index == word.length()) {
            return true;
        }

        if (r < 0 || r >= board.length || c < 0 || c >= board[r].length || board[r][c] == '#' || word.charAt(index) != board[r][c]) {
            return false;
        }

        board[r][c] = '#';

        boolean ans = search(board, word, r + 1, c, index + 1) ||
                search(board, word, r, c + 1, index + 1) ||
                search(board, word, r - 1, c, index + 1) ||
                search(board, word, r, c - 1, index + 1);

        board[r][c] = word.charAt(index);

        return ans;
    }
}