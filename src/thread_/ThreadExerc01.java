package thread_;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月17日 3:49 PM
 */
public class ThreadExerc01 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }
}
 class T1 implements Runnable{
    int count =0;
     @Override
     public void run() {
         while(count<10){
             System.out.println("hello, world "+(++count));
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 System.out.println(e.getMessage());
             }
         }
     }
 }

 class T2 implements Runnable{
     int count =0;
     @Override
     public void run() {
         while(count<5){
             System.out.println("hi "+(++count));
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 System.out.println(e.getMessage());
             }
         }
     }
 }