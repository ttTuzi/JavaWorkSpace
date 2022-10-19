package enumerationAndAnnotation.anotation_;

public class Override_ {
    public static void main(String[] args) {

    }
}

class Father{
    public void fly(){
        System.out.println("Father fly...");
    }
}

class Son extends Father{
    //解读
    //1.@Override 注解放在fly方法上,表示子类的fly方法重写的父类的fly
    //2.如果没有@Override 还是重写了父类方法
    //3.如果你写了@Override注解,
    //编译器就会检查该方法是否真的重写了父类的方法
    //如果重写了,则编译通过,否则编译器错误
    //就是查看语法,校验
    @Override
    public void fly() {
        System.out.println("Son fly...");
    }
}
