package exception_;

public class exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        //解读
        //1. 当执行num1/num2 = 10/0
        //2. 当执行到num1/num2因为num2=0,程序就会出现(抛出)异常 ArithmeticException
        //3. 当抛出异常程序就奔溃了,下面代码就不执行了
        //4. 想想这样的程序好吗? 不好,不应该出席出现了一个不致命的问题,就导致整个系统奔溃
        //5. 提供了一个异常处理机制来解决问题
//        int rse = num1/num2;
        //如果一个程序员感觉一段代码可能出现异常/问题, 就可以使用try-catch异常处理机制
        //将该代码块选中->输入快捷键 ctrl + alt + t ->选中 try-catch
        try {
            int rse = num1/num2;
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());//输入异常信息
        }
        System.out.println("程序运行异常");
    }
}
