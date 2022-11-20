package thread_.HW;

/**
 * @Description:
 * 1.有两个用户分别从同一个卡上取钱(10000)
 * 2.每次取1000,当余额不足,就不能取款
 * 3.不能出现超取
 * @author: Wei Liang
 * @date: 2022年11月20日 1:55 PM
 */
public class HW2 {
    public static void main(String[] args) {
        P1 p1 = new P1();
        Thread thread1 = new Thread(p1);
        Thread thread2 = new Thread(p1);
        thread1.start();
        thread2.start();
    }
}

class P1 implements Runnable{
    private int balance=10000;
    private boolean flag=true;
    @Override
    public void run() {
        while(flag){
            cashOut();
        }
    }

    public void cashOut(){
        synchronized (this){
            if(balance>0) {
                System.out.print(Thread.currentThread().getName() + " 取了1000");
                balance = balance - 1000;
                System.out.println(" 余额还剩: " + balance);
                try {
                    Thread.sleep(0);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }else{
                flag=false;
                System.out.println("余额不足");
            }
        }
    }
}

