package thread_;

/**
 * @Description: 演示Thread类,创建Thread
 * @author: Wei Liang
 * @date: 2022年11月17日 2:02 PM
 */
public class ThreadUse {
    public static void main(String[] args) {

        //创建cat对象
        //可以当做线程使用
        Cat cat = new Cat();
        cat.start();  //启动线程

        //cat.run 并没有开一个新的线程,只是用main线程调用run方法
        cat.run();  //因为不是多线程,只有在run结束后才会执行下面的代码

        //mian方法中启动了一个子线程Thread0,主线程不会堵塞
        //主线程和子线程交替执行
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 60; i++) {
            System.out.println("Main Thread i = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

//解读
//1.单一个类继承了Thread类,该类可以当做线程使用
//2.我们会重写run方法,写自己需要的run方法

class Cat extends Thread{
    int time = 0;
    @Override
    public void run() {
        while(true) {
            //每隔一秒输出"喵喵,我是小猫咪"
            System.out.println("喵喵,我是小猫咪"+" Time:"+time++ +" " +Thread.currentThread().getName());
            //睡眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            if(time == 80){
                break;
            }
        }
    }
}
