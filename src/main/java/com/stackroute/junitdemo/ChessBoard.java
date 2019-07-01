package com.stackroute.junitdemo;

public class ChessBoard {
    public String display() {
        String[][] board = new String[8][8];
        String s = "";
        int i, j;
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                board[i][j] = (i + j) % 2 == 0 ? "WW" : "BB";
            }
        }
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                s = s + (board[i][j] + " ");
            }
            s = s + "\n";
        }


        return s.trim();
    }
}
