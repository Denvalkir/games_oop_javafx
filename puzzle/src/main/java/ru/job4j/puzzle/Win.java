package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = true;

        for (int i = 0; i < board.length; i++) {
            if ((board[0][0] == 1) && (checkHorizontal(board, i) || checkVertical(board, i))) {
                rsl = true;
                break;
            } else if (board[0][i] == 1) {
                rsl = checkVertical(board, i);
                break;
            } else if (board[i][0] == 1) {
                rsl = checkHorizontal(board, i);
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
