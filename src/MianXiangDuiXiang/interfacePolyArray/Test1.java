package MianXiangDuiXiang.interfacePolyArray;

public class Test1 {
    public static void main(String[] args) {
        //给Usb数组中,存放Phone 和相机对象,
        // Phone类还有一个特有的方法call(),
        // 请遍历Usb数组,
        // 如果是Phone对象,除了调用Usb接口定义的方法外,还需要调用Phone 特有方法call
        Usb usb[] = new Usb[2]; //创建Usb Array
        usb[0] = new Phone();   //usb[1]运行对象是Phone
        usb[1] = new Camera();  //usb[1]运行对象是Camera
        for (int i = 0; i < usb.length; i++) {
            usb[i].work();
            //判断Phone是否是在usb[i]之下
            if(usb[i] instanceof Phone){
                ((Phone) usb[i]).call(); //向下转型
            }
        }


    }
}

interface Usb{
    void work();
}

class Phone implements Usb {
    @Override
    public void work() {
        System.out.println("手机工作中...");
    }
    public void call(){
        System.out.println("拨号中...");
    }
}

class Camera implements Usb{
    @Override
    public void work() {
        System.out.println("相机工作中...");
    }
}
