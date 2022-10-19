package MianXiangDuiXiang.MianXiangDuiXiangPractice.HomeWork;

public class HomeWork01 {
    public static void main(String[] args) {
        car car1 = new car(100);
        //Q1
        System.out.println(car1);

        car car = new car();

        //Q2
        System.out.println(car);

        //Q3
        System.out.println(car1);
    }
}
class car{
    double price =9;
    static String color = "White";

    public car(double price) {
        this.price = price;
    }

    public car() {
        this.price=9;
        this.color="red";
    }

    @Override
    public String toString() {
        return this.price+"  "+color;
    }
}

