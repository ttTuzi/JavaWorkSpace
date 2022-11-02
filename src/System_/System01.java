package System_;

import java.util.Arrays;

public class System01 {
    public static void main(String[] args) {
        System.out.println("hello 1");
        //1.
        // 直接退出程序,之后代码不会执行
        //System.exit(0);
        System.out.println("hello 2");

        int[] src={1,2,3,4};
        int[] dest=new int[3];
        //2.
        /*srcPos:   从第几位index开始
         * destPos: 粘贴到目标数组的index
         * length:  复制的位数
         */
        System.arraycopy(src,0,dest,1,2);
        System.out.println(Arrays.toString(dest));

        //3.
        //System.currentTimeMillis()
        //获取当前时间到1970-1-1的毫秒数
        double time = System.currentTimeMillis();
        System.out.println(time);

    }
}
