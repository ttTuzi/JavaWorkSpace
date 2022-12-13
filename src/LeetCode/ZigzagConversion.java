package LeetCode;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月08日 5:05 PM
 */
public class ZigzagConversion {
    public static void main(String[] args) {
        String str = convert("abcd",3);
        System.out.println(str);
    }
    public static String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder("");
        if(numRows<=1){
            return s;
        }

        //outer loop is for rows
        for(int i =0;i<numRows;i++){
            int p=0;
            for(int j=i;j<s.length();j+=(numRows+(numRows-2))){
                //append each column,except diagonal
                sb.append(s.charAt(j));
                //
                //1.check if first or last cow
                //2.if not go inside
                if(i!=0 && i!=numRows-1 && j+(2*(numRows-i-1))<s.length()){
                    //3.from up to down, check need how many need for arrived at diagonal
                    p=p+2*(numRows-1-i);
                    //4.add number of step to that row, and append
                    sb.append(s.charAt(p+i));
                    //from down to up, count how many step need for arrived at column, and update step
                    p=p+2*i;
                }
            }
        }
        return sb.toString();
    }
}
