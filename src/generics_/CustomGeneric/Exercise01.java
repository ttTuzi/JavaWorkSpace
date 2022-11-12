package generics_.CustomGeneric;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月11日 3:06 PM
 */
public class Exercise01 {
    public static void main(String[] args) {

    }

    @Test
    public void Test_(){
        Dao<user> userDao = new Dao<>();
        userDao.save("001",new user(001,18,"Kim"));
        userDao.save("002",new user(002,19,"King"));
        userDao.save("003",new user(003,28,"Smith"));
        List<user> list = userDao.list();
        for (user user1 : list) {
            System.out.println(user1);
        }
    }
}


class Dao<T>{
    Map<String,T> map = new HashMap<>();

    public T get(String id){
        return map.get(id);
    }

    public void update(String id,T entity){
        map.put(id,entity);
    }

    public List<T> list(){
        List<T> ts = new ArrayList<>();
        Set<String> set = map.keySet();
        for (String o : set) {
            ts.add(map.get(o));
        }
        return ts;
    }

    public void save(String id , T entity){
        map.put(id,entity);
    }

    public void delete(String id){
        map.remove(id);
    }
}


class user {
    private int id;
    private int age;
    private String name;

    public user(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}