package LeetCode;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月10日 6:49 PM
 */
public class CountOddNumbersInAnIntervalRange {
    public static void main(String[] args) {
        int x =countOdds(3,7);
        System.out.println(x);
    }
    public static int countOdds(int low, int high){
//        int count = 0;
//        while(low<=high){
//            if(low%2!=0){
//                count++;
//            }
//            low++;
//        }
        if(low%2==1 && high%2==1){
            return (high-low)/2+1;
        }
        return (high-low)/2;
    }
}
