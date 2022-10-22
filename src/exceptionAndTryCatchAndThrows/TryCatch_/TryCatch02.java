package exceptionAndTryCatchAndThrows.TryCatch_;

public class TryCatch02 {
    public static void main(String[] args) {
        //TryCatch可以分别捕捉多个异常
        //但是只会提示第一个发现的异常
        //子类要写在父类的前面
        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName()); //NullPointerException
            int n1 = 10;
            int n2 = 0;
            int res = n1/n2; //ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("异常"+e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("异常"+e.getMessage());
        }
    }
}

class Person{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
