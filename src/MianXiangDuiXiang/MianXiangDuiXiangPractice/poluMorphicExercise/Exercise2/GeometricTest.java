package MianXiangDuiXiang.MianXiangDuiXiangPractice.poluMorphicExercise.Exercise2;

/**
 * 定义一个GeometricTest类
 * 编写equalArea,测试2个对象面积(利用动态绑定)
 * 编写displayGeometricObject方法显示对象面积(利用动态绑定)
 */
public class GeometricTest {
    public static void main(String[] args) {
       GeometricObject a = new Circle(2,"blue",20);
       GeometricObject b = new Rectangle("red",5,4,4);
       displayGeometricObject(a);
       displayGeometricObject(b);
       System.out.println(equalsArea(a,b));

    }
    public static boolean equalsArea(GeometricObject a, GeometricObject b){
        return a.findArea() == b.findArea();
    }

    public static void displayGeometricObject(GeometricObject a){
        System.out.println(a.findArea());
    }
}
