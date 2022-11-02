package String_.StringBuilder_;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年10月31日 12:52 PM
 */
public class StringBuilder01 {
    public static void main(String[] args) {
        //解说:
        //StringBuilder有和StringBuffer兼容的API
        //但是StringBuilder不是线程安全
        //StringBuilder是StringBuffer的一个简易类
        //在单线程的时候优先使用StringBuilder,因为大多数情况下比较快

        //效率:
        //StringBuilder > StringBuffer > String

        long start = 0L;
        long end = 0L;
        StringBuffer stringBuffer = new StringBuffer("");
        StringBuilder stringBuilder = new StringBuilder("");
        start = System.currentTimeMillis();
        for (int i =0;i<20000;i++){
            stringBuffer.append(String.valueOf(i));
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer"+(end-start));

        start = System.currentTimeMillis();
        for (int i =0;i<20000;i++){
            stringBuilder.append(String.valueOf(i));
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder"+(end-start));

        String s ="";
        start = System.currentTimeMillis();
        for(int i =0;i<20000;i++){
            s=s+i;
        }
        end = System.currentTimeMillis();
        System.out.println("String"+(end-start));
    }
}
