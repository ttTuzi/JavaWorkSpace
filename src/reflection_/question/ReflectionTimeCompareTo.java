package reflection_.question;

import reflection_.Cat;

import java.lang.reflect.Method;

/**
 * @Description: 比较反射使用的时间和普通调用的时间
 * 结论:反射要慢许多
 * 优化:
 *     因为每个Field,Method,Constructor在反射中都有启用一个方法叫setAccessible
 *     setAccessible在每次调用这些反射的时候都会检查是否有权限
 *     所以执行时间会慢一些
 *     可以通过setAccessible(true)来取消
 * @author: Wei Liang
 * @date: 2023年01月18日 12:08 PM
 */
public class ReflectionTimeCompareTo {
    public static void main(String[] args) throws Exception {
        //
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);


        Class cls = Class.forName("reflection_.Cat");
        Object o = cls.newInstance();
        Method method = cls.getMethod("hi");
        start = System.currentTimeMillis();
        for (int i = 0; i <100000; i++) {
            method.invoke(o);
        }
        end = System.currentTimeMillis();
        System.out.println(end-start);

        //区别很大

        //通过取消setAccessible优化

        Class cls2 = Class.forName("reflection_.Cat");
        Object o2 = cls2.newInstance();
        Method method2 = cls2.getMethod("hi");
        method2.setAccessible(true);
        start = System.currentTimeMillis();
        for (int i = 0; i <100000; i++) {
            method2.invoke(o2);
        }
        end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
