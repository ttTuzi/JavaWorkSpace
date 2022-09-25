package MianXiangDuiXiang.MianXiangDuiXiangPractice.poluMorphicExercise.Exercise1;
public class InstanceTest{
    /**
     * 建立InstanceTest类,在类中定义方法method(Person e);
     *     在method中:
     *         1.根据e的类型调用相应的getinfo
     *         2.根据e的类型执行:
     *             1.e是Person,输出:"a person"
     *             2.e是Student, 输出:"a person  a student"
     *             3.e是Graduate,输出:"a person  a student  a graduate student"
     * @param args
     */
    public static void main(String[] args) {
        Person a = new Person();
        method(a);
        System.out.println("=================");
        Person b = new Student();
        method(b);
        System.out.println("=================");
        Person c = new Graduate();
        method(c);
    }
    public static void method(Person e){
        //System.out.println(e.getinfo());
        if(e instanceof Graduate){
            System.out.println("a person  a student  a graduate student");
        }else if(e instanceof Student){
            System.out.println("a person  a student");
        }else if(e instanceof Person){
            System.out.println("a person");
        }else{
            System.out.println("Wrong type");
        }
    }
}
class Person {
    protected String name = "person";
    protected int age = 50;

    public String getinfo() {
        return "Name: " + name + "\n" + "age: " + age;

    }
}

class Student extends Person{
    protected String school="pku";
    public String getinfo(){
        return "Name: " + name + "\n" + "age: " + age+"\nschool:"+school;
    }
}

class Graduate extends Student{
    public String major ="IT";
    public String getinfo(){
        return "Name: " + name + "\n" + "age: " + age+"\nschool:"+school+"\nmajor: "+major;
    }
}
