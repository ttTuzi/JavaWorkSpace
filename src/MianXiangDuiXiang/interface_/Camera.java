package MianXiangDuiXiang.interface_;

public class Camera implements USBInterface{
    @Override
    public void start() {
        System.out.println("相机开机中...");
    }

    @Override
    public void end() {
        System.out.println("相机关机中...");
    }
}
