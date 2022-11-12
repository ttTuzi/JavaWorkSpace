package generics_.CustomGeneric;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月11日 2:37 PM
 */
public class CustomGeneric_ {

}

//解读:
//1.Tiger 后面泛型,我们就把Tiger定义为泛型了
//2,泛型的标识符一般为单个字母大写
//3,泛型可以有多个
//4.不同成员可以使用泛型
//5.泛型不能直接引用,因为class在编译的时候无法知道需要开辟多大的空间给泛型.
//6.泛型不能用static修饰,因为static在编译class的时候就需要编译了,而这时候我们无法知道泛型的类型,因此无法编译.
class Tiger<T,R,M>{
    String name;
    T t;
    R r;
    M m;
    //泛型不能直接引用,因为class在编译的时候无法知道需要开辟多大的空间给泛型.
    //T[] tm= new T[8];
    T[] tm;
    public Tiger(String name, T t, R r, M m) {
        this.name = name;
        this.t = t;
        this.r = r;
        this.m = m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}
