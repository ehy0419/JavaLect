package org.example.week1.array9;

public class BlackStoneFinder {
    public static void main(String[] args) {

        /// Q3. 2차원 배열에서 검은돌(true)의 좌표(x, y) 찾기
        // 배열 예시
        boolean[][] board = {
                {true, false},
                {false, true}
        };

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (board[x][y]) {
                    System.out.println("검은돌(●) 위치: (" + x + "," + y + ")");
                }
            }
        }
    }
}
