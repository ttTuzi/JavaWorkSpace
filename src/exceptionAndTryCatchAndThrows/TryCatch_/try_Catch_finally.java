package exceptionAndTryCatchAndThrows.TryCatch_;

public class try_Catch_finally{
    public static void main(String[] args) {
        try{
            //代码可能有异常
        }catch(Exception e){
            //捕获到异常
            //1.当异常发生时
            //2.系统将异常封装成Exception对象e, 传递给catch
            //3.得到异常对象后,程序员自己处理
            //4.如果没有发生异常,catch代码块不执行
        }finally {
            //不管try代码块是否有异常发生,始终要执行finally
            //通常将关闭/释放资源的代码放到finally代码块中
        }
    }
}
