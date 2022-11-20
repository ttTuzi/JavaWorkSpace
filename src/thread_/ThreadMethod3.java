package thread_;

/**
 * @Description: 守护线程:主线程结束,子线程自动退出 //Daemon
 * @author: Wei Liang
 * @date: 2022年11月19日 3:38 PM
 */
public class ThreadMethod3 {
    public static void main(String[] args) throws InterruptedException {
        myDaemonThread myDaemonThread = new myDaemonThread();//守护线程
        //如果我们希望当main Thread结束后,子线程自动退出
        //只需将子线程设置为守护线程
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("宝强辛苦的工作...");
            Thread.sleep(1000);
        }
    }
}

class myDaemonThread extends Thread{
    @Override
    public void run() {
        for(;;){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("马蓉和宋喆快乐的聊天,哈哈哈~~~");
        }
    }
}