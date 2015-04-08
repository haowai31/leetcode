/**
 * Created by qinsky31 on 2015/1/27.
 */
public class Solution {
    public static boolean isValidSudoku(char[][] board) {
        boolean result = true;
        int[] flag = new int[9];
        for (int i=0;i<9;i++) {
            //Row
            for (int j=0;j<9;j++) {
                flag[j] = 0;
            }
            for (int j=0;j<9;j++) {
                if (board[i][j]!='.') {
                    if (flag[board[i][j] - '0' - 1] == 0) {
                        flag[board[i][j] - '0' - 1] = 1;
                    } else {
                        return false;
                    }
                }
            }
            //Col
            for (int j=0;j<9;j++) {
                flag[j] = 0;
            }
            for (int j=0;j<9;j++) {
                if (board[j][i]!='.') {
                    if (flag[board[j][i] - '0' - 1] == 0) {
                        flag[board[j][i] - '0' - 1] = 1;
                    } else {
                        return false;
                    }
                }
            }
            //1/9
            for (int j=0;j<9;j++) {
                flag[j] = 0;
            }
            for (int j=0;j<9;j++) {
                if (board[i / 3 * 3 + j / 3][(i - i / 3 * 3) * 3 + j - j / 3 * 3]!='.') {
                    if (flag[board[i / 3 * 3 + j / 3][(i - i / 3 * 3) * 3 + j - j / 3 * 3] - '0' - 1] == 0) {
                        flag[board[i / 3 * 3 + j / 3][(i - i / 3 * 3) * 3 + j - j / 3 * 3] - '0' - 1] = 1;
                    } else {
                        return false;
                    }
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','.','7','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(board));
    }
}
