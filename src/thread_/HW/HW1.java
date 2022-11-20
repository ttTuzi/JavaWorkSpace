package thread_.HW;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

/**
 * @Description:
 * 1.在main方法中启动两个线程
 * 2.第一个线程随机打印100以内的数
 * 3.直到第二个方法从键盘中读取'Q'
 * @author: Wei Liang
 * @date: 2022年11月20日 1:18 PM
 */
public class HW1 extends JFrame {
    public static void main(String[] args) {
        Thread01_ thread01_ = new Thread01_();
        thread01_.start();
        Thread02_ thread02_ = new Thread02_(thread01_);
        thread02_.start();

    }

}

class Thread01_ extends Thread{
    private boolean flag = true;
    @Override
    public void run() {
        while(flag){
            System.out.println((int) (Math.random()*(101)+1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

class Thread02_ extends Thread{
    Thread01_ thread01_;
    private Scanner scanner = new Scanner(System.in);

    public Thread02_(Thread01_ thread01_){
        this.thread01_=thread01_;
    }

    @Override
    public void run() {
        System.out.println("输入Q停止");
        String key = scanner.next();
        while(true){
            if(key.equals("Q")){
                thread01_.setFlag(false);
                return;
            }
            System.out.println("输入Q停止");
            key=scanner.next();
        }
    }

}
