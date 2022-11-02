package exceptionAndTryCatchAndThrows.TryCatch_;

public class TryCatch01 {
    public static void main(String[] args) {
        try {
            String str ="123";
            int a = Integer.parseInt(str);
            System.out.println("Num: "+a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息: "+e.getMessage());;
        }finally {
            System.out.println("程序被finally执行...");
        }
        System.out.println("程序继续...");
    }
}
