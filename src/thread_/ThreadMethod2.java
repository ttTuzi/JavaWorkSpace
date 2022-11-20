package thread_;

/**
 * @Description: Thread.join
 * @author: Wei Liang
 * @date: 2022年11月18日 4:45 PM
 */
public class ThreadMethod2 {
    public static void main(String[] args){
        A t1 = new A();
        Thread thread = new Thread(t1);
        thread.start();
        for(int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+": hi "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            if(i==5){
                System.out.println("main let sub thread first");
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

class A implements Runnable {
    int count=0;
    @Override
    public void run() {
        while(true){
            System.out.println(Thread.currentThread().getName()+ ": hello "+ (++count) );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            if(count >=20){
                break;
            }
        }
    }
}