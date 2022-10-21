package MianXiangDuiXiang.MianXiangDuiXiangPractice.HomeWork;

//内部类练习
// 有一个Car类,有属性temperature (温度) ,车内有Air(空调)类,有吹风的功能flow,
// Air会监视车内的温度,如果温度超过40度则吹冷气。
// 如果温度低于0度则吹暖气,如果在这之间则关掉空调。
// 实例化具有不同温度的Car对象,调用空调的flow方法,测试空调吹的风是否正确
public class HomeWork07 {
    public static void main(String[] args) {
        Car02 car = new Car02(2);
        car.new Air().flow();
    }
}

class Car02{
    private int temperature;

    public Car02(int temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if(temperature<0){
                System.out.println("温度小于了0度,空调吹暖气...");
            }else if(temperature>40){
                System.out.println("温度大于了40度,空调吹冷气...");
            }else{
                System.out.println("温度正常,空调关闭...");
            }
        }
    }
//    public Air getAir(){
//        return new Air();
//    }
}
