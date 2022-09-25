package MianXiangDuiXiang.MianXiangDuiXiangPractice;

public class Student {
    String name;
    int age;
    String major;
    String interests;

    public Student(){

    }
    public Student(String name, int age, String major, String interests){
        this.name = name;
        this.age = age;
        this.major = major;
        this.interests = interests;
    }

    public void say(){
        System.out.println("My name is "+this.name
                +", " +this.age+" years old "+", my major is "+this.major + " and my interests is "+this.interests);
    }
}
