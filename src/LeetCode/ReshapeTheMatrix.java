package LeetCode;

import java.util.Arrays;

/**
 * @Description: TODO
 * [1,2]
 * [3,4] r=1, c=4 ====>
 * [1,2,3,4]
 * @author: Wei Liang
 * @date: 2022年12月13日 5:25 PM
 */
public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int[][]answer = matrixReshape(mat,5,1);
        for(int i = 0;i<answer.length;i++){
            for(int j = 0;j<answer[i].length;j++){
                System.out.print(answer[i][j]);
            }
            System.out.println(" ");
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if((mat.length*mat[0].length)!=(r*c)){
            return mat;
        }
        int[][] arr = new int[r][c];
        int x =0;
        int y = 0;
        for(int i =0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(x<c){
                  arr[y][x] = mat[i][j];
                  x=x+1;
                }
                if(x==c){
                    x=0;
                    y=y+1;
                }
            }
        }
        return arr;
    }
}
