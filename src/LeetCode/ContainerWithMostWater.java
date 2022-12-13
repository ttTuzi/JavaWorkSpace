package LeetCode;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月09日 5:36 PM
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int max = maxArea(height);
        System.out.println(max);
    }
    public static int maxArea(int[] height) {
        int lp=0;
        int rp=height.length-1;
        int max=0;
        while(lp<rp){
            int h =(Math.min(height[lp],height[rp]));
            int w = (rp-lp);
            int area = (Math.min(height[lp],height[rp]))*(rp-lp);
            max = Math.max(area,(Math.min(height[lp],height[rp]))*(rp-lp));
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return max;
    }
}
