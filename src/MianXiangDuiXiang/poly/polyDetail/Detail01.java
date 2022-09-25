package MianXiangDuiXiang.poly.polyDetail;

public class Detail01 {
    public static void main(String[] args) {
        Base p1 = new Sup();
        System.out.println(p1.count); //看编译类型, 所以结果是10

    }
}

class Base{
    int count = 10;
}

class Sup extends Base{
    int count = 20;
}
