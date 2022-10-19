package MianXiangDuiXiang.MianXiangDuiXiangPractice.HomeWork;

//1.在Frock类中声明私有变的静态属性currentNum(int 类型),初始值为100000, 作为衣服出场的序列号起始值
//2.声明公有的方法getNextNum,作为生成上衣唯一序列号.每调用一次增加currentNum100,并作为返回值
//3.调用2次getNextNum方法,获取序列号并输出
//4.在Frock类中声明serialNumber()属性,并提供get方法
//5.在Frock类的构造器,中通过调用getNextNum方法,赋予给serialNUmber属性
//6.在TestFrock类中,
public class HomeWork02 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        System.out.println(frock.getSerialNUm());
        System.out.println(frock1.getSerialNUm());
        System.out.println(frock2.getSerialNUm());

    }
}
class Frock{
    private static int currentNum = 100000;
    private int serialNUm;
    public Frock(){
        this.serialNUm = getNextNum();
    }
    public int getSerialNUm() {
        return serialNUm;
    }

    public static int getNextNum(){
        currentNum=currentNum+100;
        return currentNum;
    }
}
