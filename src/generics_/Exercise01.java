package generics_;

import java.util.*;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月11日 12:39 PM
 */
public class Exercise01 {
    //创建3个学生对象
    //放入hashset中,使用对象
    //放入hashmap中,要求key是String name,Value是学生对象
    //使用两种方式遍历
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("joy",28));
        hashSet.add(new Student("kim",31));
        hashSet.add(new Student("jack",14));
        hashSet.add(new Student("sam",53));
        for (Student student : hashSet) {
            System.out.println(student);
        }
        System.out.println("====================");
        Iterator<Student> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=============");
        HashMap<String, Student> hashMap = new HashMap<>();
        hashMap.put("tom",new Student("tom",28));
        hashMap.put("kenn",new Student("kenn",23));
        hashMap.put("gary",new Student("gary",18));
        Set<String> strings = hashMap.keySet();
        for (String string : strings) {
            System.out.println(hashMap.get(string));
        }

    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
