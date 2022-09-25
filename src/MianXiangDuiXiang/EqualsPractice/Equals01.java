package MianXiangDuiXiang.EqualsPractice;

//重写equals,对比2个person类的属性是否相等.
public class Equals01 {
    public static void main(String[] args) {
        Person p1 = new Person("jack", 20, 'M');
        Person p2 = new Person("jack", 20, 'M');
        System.out.println(p1.equals(p2));  //在重写前,输出false,因为在object类中,对比2个是否是同一个对象. (this == object)
        System.out.println(p1.equals(p2));  //在重写后,输出True.
        System.out.println(p1.toString());
        p1 = null;


    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //重写equals
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person) { //如果是是person或者person的子类,进入判断.
            Person p1 = ((Person) obj);
            return (this.age == p1.age && this.gender == p1.gender && this.name.equals(p1.name));
        } else {
            return false;
        }
    }


}
