package event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @Description: 通过键盘输入来控制小球的移动
 * @author: Wei Liang
 * @date: 2022年11月12日 3:45 PM
 */
public class BallMove extends JFrame{
    MyPanel mp = null;

    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(mp);
    }

    public static void main(String[] args) {
        new BallMove();
    }
}

//可以画出小球
//监听键盘
class MyPanel extends JPanel implements KeyListener {
    int x =10;
    int y =10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,50,50);
    }

    //如果有字符输出的话,会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //当某个键按下是会触发
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar() == 'w') {
            y-=10;
        }
        if(e.getKeyChar() == 's') {
            y+=10;
        }if(e.getKeyChar() == 'a') {
            x-=10;
        }if(e.getKeyChar() == 'd') {
            x+=10;
        }
        this.repaint();
    }

    //当某个键释放了会触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
