package enumerationAndAnnotation.enum_;

public class Enum01 {
    public static void main(String[] args) {
//        Season Spring = new Season("Spring", "Warm");
//        Season Summer = new Season("Summer", "hot");
//        Season Fall = new Season("Fall", "Cool");
//        Season Winter = new Season("Winter", "Cold");
//        //对于季节而言,它的对象是固定的4个季节,不会有更多
//        //设计这个类就比较失败,违反了设计思维,不能体现季节是固定的
//        //从而希望====>枚举类(把具体的对象一个一个的列举出来的类,只读,不修改)
//        Season other = new Season("other","^^^");

        System.out.println(Season.SPRING);
        System.out.println(Season.FALL);
    }
}
//演示自定义枚举
class Season{
    private String name;
    private String desc;

    //4.定义了4个对象,可以在main方法中使用了
    //5.固定了
    public final static Season SPRING = new Season("Spring", "Warm");
    public final static Season SUMMER = new Season("Summer", "hot");
    public final static Season FALL = new Season("Fall", "Cool");
    public final static Season WINTER = new Season("Winter", "Cold");
    //1.将构造器私有化,防止直接new
    //2.去掉set方法,防止属性被修改
    //3.在Season内部,直接创建固定对象. public static Season XXXX = new Season();
    //6.可以优化一下,加final关键字
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
