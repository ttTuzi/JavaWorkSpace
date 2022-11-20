package thread_.sychronized_;

/**
 * @Description: synchronized互斥锁
 * @author: Wei Liang
 * @date: 2022年11月18日 2:36 PM
 */
public class SellTicket_ {
    public static void main(String[] args) {
//        SellTicket sellTicket1 = new SellTicket();
//        SellTicket sellTicket2 = new SellTicket();
//        SellTicket sellTicket3 = new SellTicket();
//
//        //会出现票数多卖现象
////        sellTicket1.start();
////        sellTicket2.start();
////        sellTicket3.start();
//
//        SellTicket2 ticket2 = new SellTicket2();
//        new Thread(ticket2).start();
//        new Thread(ticket2).start();
//        new Thread(ticket2).start();
//
//
        SellTicket3 sellTicket3 = new SellTicket3();
        new Thread(sellTicket3).start();
        new Thread(sellTicket3).start();
        new Thread(sellTicket3).start();
    }
}
        //会出现多卖
//class SellTicket extends Thread{
//    static int tickets = 100;
//
//    @Override
//    public void run() {
//        while(tickets>0){
//            System.out.println(Thread.currentThread().getName() + "卖了一张票, 还剩: "+ (--tickets));
//            try {
//                Thread.sleep(30);
//            } catch (InterruptedException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//}
        //会出现多卖
//class SellTicket2 implements Runnable{
//    int tickets = 100;
//
//
//    @Override
//    public void run() {
//        while(tickets>0){
//            System.out.println(Thread.currentThread().getName() + "卖了一张票, 还剩: "+ (--tickets));
//            try {
//                Thread.sleep(30);
//            } catch (InterruptedException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//}

//使用synchronized实现线程同步
class SellTicket3 implements Runnable{
    int tickets = 100;
    boolean loop =true;
    Object object = new Object();
    @Override
    public void run() {  //在同一时刻,只能有一个线程来操作run方法
        while(loop){
            sell();
        }
    }


    //public synchronized void sell(){
    //1.这是锁的是 this对象
    //2.也可以在代码块上写synchronized,同步代码块,互斥锁的还是 this对象
    public /*synchronized*/ void sell(){
        synchronized (/*this*/object) {
            if (tickets <= 0) {
                System.out.println("结束");
                loop = false;
                return;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + " 出售一张票, 剩余票数=" + (--tickets));
        }
    }

    //1.同步方法(静态)的锁为当前类本身
    //2.锁是加在SellTicket3.class
    public synchronized static void m1(){

    }
    //3.如果在静态方法类中实现一个代码块,那么需要把锁加在类本身上`
    public synchronized static void m2(){
        synchronized (SellTicket3.class){
            System.out.println("m2");
        }
    }
}
