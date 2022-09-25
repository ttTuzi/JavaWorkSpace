package MianXiangDuiXiang.extendsVSimplements;

public class Test1 {
    public static void main(String[] args) {
        LittleMonkey WuKong = new LittleMonkey("WuKong");
        WuKong.climbing();
        WuKong.swimming();
        WuKong.fly();
    }
}

class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println(name+"会爬树");
    }
}

interface fish{
    void swimming();
}

interface bird{
    void fly();
}
class LittleMonkey extends Monkey implements fish,bird{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName()+"学会了游泳");
    }

    @Override
    public void fly() {
        System.out.println(getName()+"学会了飞翔");
    }
}

