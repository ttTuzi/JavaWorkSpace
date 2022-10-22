package exceptionAndTryCatchAndThrows.TryCatch_;

public class TryCatch03 {
    public static void main(String[] args) {
        //TryFinally不会捕获异常
        //因此如果有异常,在执行完finally之后程序就会奔溃
        try {
            int n1 = 10;
            int n2 = 0;
            int res = n1/n2;//异常
        } finally {
            System.out.println("程序执行了finally...");//执行
        }
        System.out.println("程序继续执行...");//不会执行
    }
}
