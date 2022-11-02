package String_;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年10月24日 2:29 PM
 */
public class String01 {
    public static void main(String[] args) {
        //1.方式一
        //直接访问常量池,然后赋值jack
        //访问的地址是常量池中的jack的地址
        String str = "jack";

        //2.方式二
        //访问堆空间
        //在堆空间中有value method
        //通过value method去寻找常量池中的数据
        //如果常量池中没有,则再创建
        //访问的是堆空间中value的地址,虽然value最终指向常量池,但是地址还是堆空间的地址
        String str1 = new String("jack");

        //Q1
        //解析:
        //虽然他们最终但是指向常量池中的同一个jack
        //但是str1访问的地址是value,所以地址不一样,输出false
        System.out.println(str1 == str);//false

        System.out.println("===========");
        //Q2
        String s1 = "hspedu";
        String s2 = "java";
        String s4 = "java";
        String s3 = new String("java");
        System.out.println(s2==s3); //false
        System.out.println(s2==s4); //true
        System.out.println(s2.equals(s3));  //true
        System.out.println(s1==s3); //false

        //Q3
        Person p1 = new Person();
        p1.name = "hspedu.";
        Person p2 = new Person();
        p2.name = "hspedu.";

        System.out.println("======");
        System.out.println(p1.name.equals(p2.name)); //true
        System.out.println(p1.name == p2.name); // true
        System.out.println(p1.name == "hspedu."); // true

    }
}

class Person{
     String name;
}

