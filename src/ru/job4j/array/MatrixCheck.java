package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (char[] chars : board) {
            for (int j = 0; j < chars.length; j++) {
                if (board[row][j] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
