package exceptionAndTryCatchAndThrows.Throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public static void main(String[] args) {

    }
    public void f1() throws Exception {
        //创建了一个文件流对象
        //解读:
        //这里的异常是一个FileNotFindException 编译异常
        //使用Try-Catch-Finally
        //或者可以使用throws,抛出异常, 让调用它的方法处理
        FileInputStream fis = new FileInputStream("sd");
    }
}
