package LeetCode;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月10日 8:19 PM
 */
public class AverageSalary {
    public static void main(String[] args) {

    }
    public static double average(int[] salary){
        int min = salary[0];
        int max = salary[0];
        int sum = 0;
        for(int i =0;i<salary.length;i++){
            max = Math.max(max,salary[i]);
            min = Math.min(min,salary[i]);
            sum = sum+salary[i];
        }
//        int sum = 0;
//        for(int i=0;i<salary.length;i++){
//            if(salary[i]!=max && salary[i]!=min){
//                sum = sum+salary[i];
//            }
//        }
        return ((double)sum-max-min)/(salary.length-2);
    }
}
