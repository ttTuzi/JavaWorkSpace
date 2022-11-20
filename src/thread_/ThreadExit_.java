package thread_;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月18日 3:08 PM
 */
public class ThreadExit_ {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();

        //如果希望Main Thread控制Thread0
        //就必须可以修改loop变量
        //让t退出run方法,从而终止t线程 -> 通知方式

        //让mian thread休眠10秒,在退出
        Thread.sleep(10*1000);
        t.setLoop(false);
    }
}

class T extends Thread{
    private int count = 0;
    private boolean loop = true;
    @Override
    public void run() {
        while(loop){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("T运行中..."+(++count));
        }
    }

    public void setLoop(boolean loop){
        this.loop = loop;
    }
}
