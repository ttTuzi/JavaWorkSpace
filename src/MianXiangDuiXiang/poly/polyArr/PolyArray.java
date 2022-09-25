package MianXiangDuiXiang.poly.polyArr;

public class PolyArray {
    public static void main(String[] args) {
        /*
        应用实例:现在有一个继承结构如下:
        要求创换一个person对象,2个student对象和2个teacher对象
        统一放在数组中,并调用每个对象的say方法
         */
        Person p1[] = new Person[5];
        p1[0] = new Person("jack",20);
        p1[1] = new Student("jack",18,100);
        p1[2] = new Student("smith",19,30.1);
        p1[3] = new Teacher("scott",30,20000);
        p1[4] = new Teacher("jack",50,25000);
        for (int i = 0; i < p1.length; i++) {
            System.out.println(p1[i].say());
        }


    }
}
