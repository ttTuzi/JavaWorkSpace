package MianXiangDuiXiang.interface_.interfacePractice;

public class P2 {
    public static void main(String[] args) {
        CC cc = new CC();
        cc.pX();
    }
}
interface AA{
    int x = 0;
}
class BB{
    int x = 1;
}
class CC extends BB implements AA{
    public void pX(){
        //System.out.println(x); //错误,原因是x不明确是哪个的x
        //解决: 明确指定x. 使用super,或者class.name
        System.out.println("父类BB:"+super.x+", 接口AA:"+ AA.x);
    }

}