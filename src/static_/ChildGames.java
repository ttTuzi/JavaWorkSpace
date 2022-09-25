package static_;

public class ChildGames {
    public static void main(String[] args) {
        Child child = new Child();
        child.join("a");
        Child child1 = new Child();
        child1.join("b");


        //类变量可通过类名来访问
        System.out.println("共有"+Child.count+"个小孩加入了游戏");
    }

}

class Child {
    private String name;
    //定义一个variable count,是一个类变量(static)
    //该变量最大的特点就是会被Child对象共享
    public static int count = 0;

    public void join(String name) {
        //count++;
        System.out.println(name + "加入了游戏");
        System.out.println("count: "+count);
    }
}

class Adult extends Child{

}