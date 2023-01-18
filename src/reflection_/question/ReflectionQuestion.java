package reflection_.question;

import reflection_.Cat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 1/17/2023 8:48 PM
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws Exception {
        //传统方法
        Cat cat = new Cat();
        cat.hi();

        System.out.println("=============");

        //使用properties类
        //1.读写文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("C:\\Users\\lwei2\\IdeaProjects\\JavaWorkSpace\\src\\reflection_\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println("classfullpath= "+classfullpath);
        System.out.println("method= "+method);
        //行不通了

        System.out.println("======================");

        //使用反射机制实现
        //1. 加载类,返回class对象
        Class cls = Class.forName(classfullpath);
        //2.通过cls加载得到的类的对象实例
        Cat cat2 = (Cat) cls.newInstance();
        //3.在反射中可以把方法视为一个对象
        Method method1 = cls.getMethod(method);
        //4.通过
        method1.invoke(cat2); //方法.invoke(对象)

        //还可以获得成员变量
        //getField不能获得私有属性
        Field nameField = cls.getField("age");
        System.out.println(nameField.get(cat2));  //

        //构造器
        Constructor constructor1 = cls.getConstructor(); //()中可以指定构造器类型, 现在是无参构造器
        Constructor constructor2 = cls.getConstructor(String.class); //()这里传入的String.class就是String类的class对象

        System.out.println(constructor1);
        System.out.println(constructor2);

    }
}
