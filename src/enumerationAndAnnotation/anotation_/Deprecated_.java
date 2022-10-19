package enumerationAndAnnotation.anotation_;

public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
        System.out.println(a.n1);
    }
}

//解读
//1. @Deprecated  修饰某个元素, 表示该元素已经过时
//2. 就是不推荐使用, 但任然可以使用
//3. 可以修饰方法, 类, 字段, 参数 等等
//4. @Deprecated 的作用可以做旧到新版本的过渡和兼容
@Deprecated
class A{
    @Deprecated
    public int n1 = 10;
    @Deprecated
    public void hi(){

    }
}
