class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean result = search(board, word, i, j);
                    if (result) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean search(char[][] board, String word, int r, int c) {
        if (word.isEmpty()) {
            return true;
        }

        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] != word.charAt(0)) {
            return false;
        }
        
        char original = board[r][c];
        board[r][c] = '#';
        
        boolean result = search(board, word.substring(1), r + 1, c) ||
                search(board, word.substring(1), r - 1, c) ||
                search(board, word.substring(1), r, c + 1) ||
                search(board, word.substring(1), r, c - 1);
        
        board[r][c] = original;

        return result;

    }
}