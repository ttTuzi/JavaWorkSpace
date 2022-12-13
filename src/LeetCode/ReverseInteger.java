package LeetCode;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月08日 3:08 PM
 */
public class ReverseInteger {
    public static void main(String[] args) {
        Integer a =reverse(-1563847412);
        System.out.println(534236469*10);
        System.out.println(a);
    }

    public static int reverse(Integer x){
        int sum = 0;
        if(x<10 && x>-10){
            return x;
        }
        while(x>0){
            int remainder = x%10;
            x=x/10;

            //check overflow
            if(x>0){
                if((sum*10+remainder)>214748364){
                    return 0 ;
                }
            }
            sum = sum*10 +remainder;

        }
        while(x<0){
            int remainder = x%10;
            x=x/10;

            //check overflow
            if(x<0){
                if((sum*10+remainder)<-214748364){
                    return 0 ;
                }
            }

            sum = sum*10 +remainder;
        }

        return sum;
    }
}
