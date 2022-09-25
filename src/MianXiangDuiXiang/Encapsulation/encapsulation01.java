package MianXiangDuiXiang.Encapsulation;

public class encapsulation01 {

    public static void main(String[] args) {
        Person person = new Person();
        person.name="Wei";
        person.setAge(20);
        person.setSalary(30000);
        System.out.println(person.info());
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter password");
//        int p = scanner.nextInt();
//        person.getSalary(p);

        Person wei1 = new Person("Wei1", 200, 10000);
        System.out.println(wei1.info());
    }
    /*
     * 不能随便查年龄,工资,并对年龄进行验证,合理就可以设置
     * 年龄1-120,name2-6字符
     * */
}
class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
        this.setSalary(salary);
        this.setAge(age);
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age>=1 && age <=120) {
            this.age = age;
        }else{
            System.out.println("你设置的年龄不对,给你默认年龄");
            this.age = 18;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String info(){
        return ("name= "+name+", age= "+age);
    }
}
