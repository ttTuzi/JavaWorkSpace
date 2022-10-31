package String_.StringBuffer_;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年10月31日 12:19 PM
 */
public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);//append底层把null装换成String "null"
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer);


        try {
            StringBuffer stringBuffer1 = new StringBuffer(str);//NullPointException
            System.out.println(stringBuffer1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        StringBuffer stringBuffer2 = new StringBuffer(stringBuffer);
        System.out.println(stringBuffer2); //null
    }


}
