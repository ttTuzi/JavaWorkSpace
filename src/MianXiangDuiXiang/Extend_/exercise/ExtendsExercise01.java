package MianXiangDuiXiang.Extend_.exercise;

public class ExtendsExercise01 {

    //what is the output?
    public static void main(String[] args) {
        B b = new B();
    }
}

class A {
    A() {
        System.out.println("a");
    }
}

class B extends A{
    B(){
      this("abc");
        System.out.println("b");
    }
    B(String name){
        //这里默认有super（）
        System.out.println("b name");
    }
}

