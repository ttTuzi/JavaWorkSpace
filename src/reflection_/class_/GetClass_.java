package reflection_.class_;

import reflection_.Car;

/**
 * @Description: 演示得到class类的方式
 * @author: Wei Liang
 * @date: 2023年01月18日 1:16 PM
 */
public class GetClass_ {
    public static void main(String[] args) throws Exception{
        //方式1:
        //已知一个类的全路径
        //应用场景配置文件,加载类
        String classPath = "reflection_.Car";
        Class<?> cls = Class.forName(classPath);

        //方式2
        //已知具体类
        //应用场景参数传递
        System.out.println(Car.class);

        //方式3
        //应用场景,有对象实例
        Car car = new Car();
        Class cls3 = car.getClass();
        System.out.println(cls3);

        //方式4:
        ClassLoader classLoader = car.getClass().getClassLoader();
    }
}
