package thread_;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月18日 3:31 PM
 */
public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        //test some method
        G g = new G();
        g.setName("wei");
        g.setPriority(Thread.MIN_PRIORITY);
        g.start();

        //main thread print 5 hi, and then end sub-Thread
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi " + i);
        }

        System.out.println(g.getName()+" priority is: " + g.getPriority());
        g.interrupt(); //when we get here, the Thread g will interrupt, end sleep

    }
}

class G extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "吃包子..." + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "Sleeping...");
                Thread.sleep(20000);

                //catch a interrupted exception
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " is interrupted");
            }
        }
    }
}
