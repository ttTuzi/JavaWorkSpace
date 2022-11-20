package thread_;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月19日 4:16 PM
 */
public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        P p = new P();
        System.out.println(p.getName()+ " 状态 "+p.getState());

        p.start();
        while(Thread.State.TERMINATED !=p.getState()){
            System.out.println(p.getName()+" 状态 "+p.getState());
            Thread.sleep(500);
        }

        System.out.println(p.getName()+" 状态 "+p.getState());

    }
}

class P extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.println("hi " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}