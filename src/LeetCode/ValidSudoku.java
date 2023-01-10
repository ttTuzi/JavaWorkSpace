package LeetCode;

import java.util.HashSet;
import java.util.Hashtable;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月19日 9:30 PM
 */
public class ValidSudoku {
    public static void main(String[] args) {
        char board[][] = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        boolean tf = isValidSudoku(board);
        System.out.println(tf);
    }

    public static boolean isValidSudoku(char[][] board) {
//        HashSet<Character> row = new HashSet();
//        HashSet<Character> col = new HashSet();
//        HashSet<Character> box = new HashSet();
        int boxRow = 0;
        int boxCol = 0;
        for (int i = 0; i < board.length; i++) {

            HashSet<Character> row = new HashSet();
            HashSet<Character> col = new HashSet();
            HashSet<Character> box = new HashSet();
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.' && !row.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' && !col.add(board[j][i])) {
                    return false;
                }
                //And so on...
                //But, the j iterates from 0 to 9.
                //
                //But we need to stop after 3 horizontal steps, and go down 1 step vertical.
                //
                //Use % for horizontal traversal. Because % increments by 1 for each j : 0%3 = 0 , 1%3 = 1, 2%3 = 2, and resets back. So this covers horizontal traversal for each block by 3 steps.
                //
                //Use / for vertical traversal. Because / increments by 1 after every 3 j: 0/3 = 0; 1/3 = 0; 2/3 =0; 3/3 = 1.
                //
                //So far, for a given block, you can traverse the whole block using just j.
                //
                //But because j is just 0 to 9, it will stay only first block. But to increment block, use i. To move horizontally to next block, use % again : ColIndex = 3 * i%3 (Multiply by 3 so that the next block is after 3 columns. Ie 0,0 is start of first block, second block is 0,3 (not 0,1);
                //
                //Similarly, to move to next block vertically, use / and multiply by 3 as explained above. Hope this helps.
                boxRow = 3*(i / 3)+(j/3);
                boxCol = 3*(i % 3)+(j%3);
                if (board[boxRow][boxCol] != '.' && (!box.add(board[boxRow][boxCol] ))) {
                    return false;
                }


            }
        }
        return true;
    }
}
