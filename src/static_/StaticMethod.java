package static_;

public class StaticMethod {
    public static void main(String[] args) {
        // use non static method have to create a new obj, and have to use obj.method
        Stu stu = new Stu("a");
        stu.payFee(20);

        Stu stu1 = new Stu("b");
        stu1.payFee(40);

        stu.showFee();

        //use Static method you have to use class.method.
        //And you don't have to create a new obj
        Stu_Static.payFee(20);
        Stu_Static.payFee(20);
        Stu_Static.showFee();

    }
}

class Stu {
    private String name;
    //定义一个static variable去累计学生学费
    private static double Fee = 0;

    public Stu(String name) {
        this.name = name;
    }
    public void payFee(double Fee){
        Stu.Fee += Fee;
    }

    public void showFee(){
        System.out.println("总学费"+Stu.Fee);
    }
}

class Stu_Static{
    private String name;
    //定义一个static variable去累计学生学费
    private static double fee = 0;

    public Stu_Static(String name) {
        this.name = name;
    }
    public static void payFee(double fee){
        Stu_Static.fee += fee;
    }

    public static void showFee(){
        System.out.println("总学费"+Stu_Static.fee);
    }
}