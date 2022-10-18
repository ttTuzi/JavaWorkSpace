package enumerationAndAnnotation.enum_;

public class Enum02 {
    public static void main(String[] args) {
        System.out.println(Season02.SPRING);
    }
}
enum Season02{

//    public final static Season SPRING = new Season("Spring", "Warm");
//    public final static Season SUMMER = new Season("Summer", "hot");
//    public final static Season FALL = new Season("Fall", "Cool");
//    public final static Season WINTER = new Season("Winter", "Cold");

    //如果使用关键字enum实现
    //1.使用关键字enum 替代 class
    //2.public final static Season SPRING = new Season("Spring", "Warm");
    //改成 SPRING("Spring","Warm");
    //解读:常量名(实例列表)
    //3.如果有多个常量名(对象),使用 , 间隔即可
    //4.如果用enum实现,要求将定义的对象写在前面
    SPRING("Spring","Warm"),WINTER("Summer","Hot");
    private String name;
    private String desc;
    private Season02(String name, String desc) {
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

