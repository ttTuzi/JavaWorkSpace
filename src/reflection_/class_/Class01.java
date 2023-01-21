package reflection_.class_;

import reflection_.Car;

import java.lang.reflect.Field;

/**
 * @Description: 演示class类的常用方法
 * @author: Wei Liang
 * @date: 2023年01月18日 12:45 PM
 */
public class Class01 {
    public static void main(String[] args) throws Exception{
        String classPath = "reflection_.Car";
        //获取car类对应的class对象
        //<?>表示不确定的java类型
        Class<?> cls = Class.forName(classPath);
        //输出cls
        System.out.println(cls);  //显示cls对象, 哪个类的class对象
        System.out.println(cls.getClass());  //输出cls运行类型
        System.out.println(cls.getPackage().getName()); //显示包名
        System.out.println(cls.getName());  //类名
        //通过cls创建对象实例
        Car car = (Car) cls.newInstance();
        System.out.println(car);

        //通过反射获取属性
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car)); //私有属性会报错

        //通过反射给属性赋值
        brand.set(car,"奔驰");
        System.out.println(brand.get(car));

        //得到所有的属性
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}
