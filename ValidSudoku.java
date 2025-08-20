package java2;

import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println("Is Sudoku board valid? " + isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            HashSet<Character> box = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                // Row
                if (board[i][j] != '.' && !row.add(board[i][j])) return false;

                // Column
                if (board[j][i] != '.' && !col.add(board[j][i])) return false;

                // Box
                int rowIndex = 3 * (i / 3);
                int colIndex = 3 * (i % 3);
                char val = board[rowIndex + j / 3][colIndex + j % 3];
                if (val != '.' && !box.add(val)) return false;
            }
        }
        return true;
    }
}
