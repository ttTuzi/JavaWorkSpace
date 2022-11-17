package thread_;

/**
 * @Description: 使用runnable实现Thread
 * @author: Wei Liang
 * @date: 2022年11月17日 3:11 PM
 */
public class ThreadImplementRunnable {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //dog.start(); 不能调用start
        Thread thread = new Thread(dog);
        //因为dog实现了runnable,就可以放入到Thread里
        //而thread可以调用dog的方法是因为底层使用了静态代理设计模式
        thread.start();
    }
}

//代理模式,模拟了最简单的Thread方法
class ThreadProxy implements Runnable{
    private Runnable target = null;
    @Override
    public void run() {
        if(target!=null){
            target.run();
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start(){
        start0();
    }

    public void start0(){
        run();
    }
}
class Dog implements Runnable{
    int count =0;
    @Override
    public void run() {
        while(true) {
            //每隔一秒输出"小狗,汪汪叫"
            System.out.println("小狗,汪汪叫"+" Time:"+ ++count +" " +Thread.currentThread().getName());
            //睡眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            if(count == 80){
                break;
            }
        }
    }
}
