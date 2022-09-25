package MianXiangDuiXiang.poly.polyDetail;

public class Detail02 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB); //instanceof判定类像是否是子类
        System.out.println(bb instanceof AA);
        AA aa = new BB();
        System.out.println(aa instanceof AA); //aa使用运行类型来对比
        System.out.println(aa instanceof BB);

        Object obj = new Object();
        System.out.println(obj instanceof AA);

    }
}

class AA{

}

class BB extends AA {

}