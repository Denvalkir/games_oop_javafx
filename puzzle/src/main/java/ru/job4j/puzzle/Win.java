package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;

        for (int i = 0; i < board.length; i++) {
            if ((board[i][i] == 1) && (checkHorizontal(board, i) || checkVertical(board, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkHorizontal(int[][] board, int index) {
        boolean rsl = true;

        for (int i = 0; i < board.length; i++) {
            if (board[index][i] == 0) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkVertical(int[][] board, int index) {
        boolean rsl = true;

        for (int i = 0; i < board.length; i++) {
            if (board[i][index] == 0) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
