package MianXiangDuiXiang;

public class People {
    private int age;
    private String name;
    public People(){

     }
     public People(int age,String name){
        this.age=age;
        this.name=name;
     }

    public int getAge() {
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void tostring(){
        System.out.print("Your name is "+name+" and age is "+age+" years old.121233");
    }
}
