package thread_;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月19日 3:18 PM
 */
public class ThreadExeric02 {
    public static void main(String[] args) throws InterruptedException {
        Hi hi = new Hi();
        Thread thread = new Thread(hi);
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+": hi "+(i));
            if(i ==5){
                thread.start();
                thread.join();
            }
            Thread.sleep(100);
        }
    }
}


class Hi implements Runnable{
    @Override
    public void run() {
        int i=0;
        while(i<10){
            System.out.println(Thread.currentThread().getName()+": hello "+(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}