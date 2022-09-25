package MianXiangDuiXiang.interface_;

public class Interface01 {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Phone phone = new Phone();
        Computer computer = new Computer();
        computer.work(phone);//手机接入计算机
        System.out.println("==============");
        computer.work(camera);
    }
}
