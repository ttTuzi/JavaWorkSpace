package Collection__.Set_.HashSet__;


import java.util.HashSet;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月07日 2:48 PM
 */
@SuppressWarnings({"all"})
public class HashSet_ {
    public static void main(String[] args) {
        //HashSet的底层是HashMap
        //可能存放null,但是只能存在一个
        //不保证元素使用有序的,取决于hash后,再确定索引的结果
        //不能有重复对象
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet);

        //添加成功输出true,否则false
        System.out.println(hashSet.add("john"));
        System.out.println(hashSet.add("lucy"));
        System.out.println(hashSet.add("jack"));
        System.out.println(hashSet.add("john"));
        System.out.println(hashSet);
        System.out.println("=============");

        //虽然dog的名字一样,但是他们的地址不一样,而且底层使用没有重写过的equals方法比较
        System.out.println(hashSet.add(new Dog("tom")));
        System.out.println(hashSet.add(new Dog("tom")));
        System.out.println(hashSet);

        System.out.println("==================");

        //之所以下面两个虽然都是新对象,但是确实重复的
        //和hashmap的底层源码有关
        //虽然他们的地址不一样,但是底层源码用String的equals方法比较,比较的是内容
        //所以,重复了
        System.out.println(hashSet.add(new String("wei")));//true
        System.out.println(hashSet.add(new String("wei")));//false
        System.out.println(hashSet);
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}