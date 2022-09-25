package MianXiangDuiXiang.interface_;

public class Phone implements USBInterface{
    @Override
    public void start() {
        System.out.println("手机开始开机中...");
    }

    @Override
    public void end() {
        System.out.println("手机关机中...");
    }
}
