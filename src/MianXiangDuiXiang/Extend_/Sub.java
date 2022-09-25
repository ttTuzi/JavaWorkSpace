package MianXiangDuiXiang.Extend_;

public class Sub extends Base{
    public Sub(){
        super("Wei");
        System.out.println("Sub()...");
    }

    public Sub(String name,int age){
        //默认有super
        System.out.println("Sub(String name,int age)");
    }

    public Sub(String name){
        super("Tom",30);
        System.out.println("Sub(String name)");
    }
    public void sayOk(){
        System.out.println(n1+" "+n2+" "+n3+" ");
        test100();
        test200();
        test300();
        //test400() error
        System.out.println("n4= "+getN4());
        callTest400();
    }
}
