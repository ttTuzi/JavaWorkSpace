package LeetCode;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月08日 3:57 PM
 */
public class MeidanOfTwoArray {
    public static void main(String[] args) {
        int[] num1 = {1,2};
        int[] num2 = {3,4};
        double a = findMedianSortedArrays(num1,num2);
        System.out.println(a);
    }
    public static double findMedianSortedArrays(int[] a1, int[] a2){
        int[] a3 = new int[a1.length+a2.length];
        int pointer=0;
        int a1p =0;
        int a2p=0;
        while(pointer<a3.length){
            if(a1p<a1.length && a2p<a2.length) {
                if (a1[a1p] <= a2[a2p]) {
                    a3[pointer] = a1[a1p];
                    a1p++;
                } else {
                    a3[pointer] = a2[a2p];
                    a2p++;
                }
            }
            else if(a1p<a1.length){
                a3[pointer]=a1[a1p];
                a1p++;
            }else{
                a3[pointer]=a2[a2p];
                a2p++;
            }
            pointer++;
        }
        if((a3.length%2)!=0){
            return (double) a3[a3.length/2];
        }else{
            return ((double)(a3[a3.length/2]+a3[(a3.length/2)-1]))/2;
        }
    }
}
