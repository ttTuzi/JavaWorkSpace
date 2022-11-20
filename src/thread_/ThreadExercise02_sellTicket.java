package thread_;

/**
 * @Description: 模拟3个窗口同时售票,fax
 * @author: Wei Liang
 * @date: 2022年11月18日 2:36 PM
 */
public class ThreadExercise02_sellTicket {
    public static void main(String[] args) {
        SellTicket sellTicket1 = new SellTicket();
        SellTicket sellTicket2 = new SellTicket();
        SellTicket sellTicket3 = new SellTicket();

        //会出现票数多卖现象
//        sellTicket1.start();
//        sellTicket2.start();
//        sellTicket3.start();

        SellTicket2 ticket2 = new SellTicket2();
        new Thread(ticket2).start();
        new Thread(ticket2).start();
        new Thread(ticket2).start();


    }
}

class SellTicket extends Thread{
    static int tickets = 100;

    @Override
    public void run() {
        while(tickets>0){
            System.out.println(Thread.currentThread().getName() + "卖了一张票, 还剩: "+ (--tickets));
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class SellTicket2 implements Runnable{
    int tickets = 100;


    @Override
    public void run() {
        while(tickets>0){
            System.out.println(Thread.currentThread().getName() + "卖了一张票, 还剩: "+ (--tickets));
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

