package MianXiangDuiXiang.MianXiangDuiXiangPractice;

//import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) {
        Student p1 = new Student("Wei Liang",20,"Computer Science","Games");
        p1.say();

        CalculateCircle c1 = new CalculateCircle();
        c1.r = 5;
        System.out.println(c1.area());
        CalculateCircle c2 = new CalculateCircle(3);
        System.out.println(c2.area());
        System.out.println(c2.perimeter());
    }
}
