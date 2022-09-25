package MianXiangDuiXiang.MianXiangDuiXiangPractice;

public class clone {
    public static void main(String[] args) {
        Student p1 = new Student();
        p1.age = 7;
        p1.name = "Wei";
        System.out.println("p1's name: "+p1.name + ", and age is "+p1.age);
        tool t1 = new tool();
        Student p2 =  t1.copy(p1);
        System.out.println("p2's name: "+p1.name + ", and age is "+p2.age);
        System.out.println(p1+"\n"+p2);

    }
}

class tool {
    public Student copy(Student p){
        Student cp = new Student();
        cp.name = p.name;
        cp.age = p.age;
        return cp;
    }
}

