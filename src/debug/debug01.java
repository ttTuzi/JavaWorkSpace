package debug;

public class debug01 {
    public static void main(String[] args) {
        //逐行执行F8
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum+=i;
            System.out.println("i=" + i);
            System.out.println("sum=" + i);
        }
        System.out.println("退出...");
    }
}
