package file_.ObjectOutAndInStream;

import java.io.Serializable;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月22日 3:28 PM
 */
public class Dog implements Serializable{
        //序列号,提高版本兼容性
        private static final long serialVersionUID = 1L;
        //static不会被序列化
        private static String nation;
        //transient不会被序列化
        private transient String color;

        private String name;
        private int age;

        public Dog(String name, int age,String nation,String color) {
            this.name = name;
            this.age = age;
            this.nation = nation;
            this.color = color;
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

    public static String getNation() {
        return nation;
    }

    public static void setNation(String nation) {
        Dog.nation = nation;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}'+nation;
    }
}
