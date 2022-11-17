package draw_;

import MianXiangDuiXiang.MianXiangDuiXiangPractice.poluMorphicExercise.Exercise2.Circle;

import javax.swing.*;
import java.awt.*;

/**
 * @Description: 画圆
 * @author: Wei Liang
 * @date: 2022年11月12日 1:23 PM
 */
public class DrawCircle extends JFrame {
    //定义一个面板
    private MyPanel mp =null;

    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle(){
        //初始化面板
        mp = new MyPanel();

        //把面板放到窗口
        this.add(mp);

        //设置窗口大小
        this.setSize(2048,1024);
        this.setVisible(true);

        //点击X可以退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//1.先定义一个Mypanel,继承Jpanel
class MyPanel extends JPanel{
    @Override
    //paint会被自动调用
    public void paint(Graphics g) {
        super.paint(g); //调用父类的方法来初始化
        System.out.println("调用...");
        g.setColor(Color.red); //设置画笔颜色
        g.fillOval(10,10,100,100);

        //画图片
        //1.获取图片资源
        //2.图片需要复制到,或者储藏到文件根目录: 在out的中的WorkSpace
        //3.然后调用以下指令,在括号中输入图像名
        Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/preview.jpg"));
        g.drawImage(image,10,10,900,900,this);

        //画字符串
        g.setFont(new Font("T",Font.BOLD,50));
        g.drawString("Tuzi",100,100);
    }
}