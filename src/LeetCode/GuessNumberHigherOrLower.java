package LeetCode;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月25日 6:23 PM
 */
public class GuessNumberHigherOrLower {
    public static void main(String[] args) {

    }

    public static int guessNumber(int n,int target) {
        int l = 1;
        int h = n;
        if(n==1){

        }
        while(l<h){
            int m = l+h >>>1;
            if(target<m){
                h=m-1;
            }
            if(target>m){
                l=m+1;
            }
            if(target==m){
                return target;
            }
        }
        return -1;
    }
}
