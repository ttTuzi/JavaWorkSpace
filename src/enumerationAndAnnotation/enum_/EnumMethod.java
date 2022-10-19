package enumerationAndAnnotation.enum_;

public class EnumMethod {
    public static void main(String[] args) {
        //使用season2 Enum类, 来演示各种方法
        Season02 fall = Season02.FALL;

        //输出enum对象的名字
        System.out.println(fall.name());
        System.out.println("============");

        //输出的是enum对象的 次序/编号(从0开始)
        //FALL是enum的第三个,因此输出是2
        System.out.println(fall.ordinal());
        System.out.println("============");

        //返回Season02[],含有定义的所有枚举对象
        Season02[] values = Season02.values();
        for (Season02 season : values) {//增强for循环
            System.out.println(season);
        }
        System.out.println("============");

        //根据你输入的"FALL"到Season02的对象去查找
        //如果找到了就返回,不然报错
        Season02 fall1 = Season02.valueOf("FALL");
        System.out.println(fall1);
        System.out.println("============");

        //对比两个enum对象的编号
        //FALL的编号-SUMMER的编号 = 3-2
        System.out.println(Season02.FALL.compareTo(Season02.SUMMER));
    }
}
