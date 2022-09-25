package MianXiangDuiXiang.interface_;

public class InterfaceDetail01 {
}

interface IB{
    void hi();
}

interface IC{
    void cry();
}
//接口可以继承多个其他接口
interface ID extends IB,IC{

}
//接口不能实现其他接口
//interface IE implements IB{}

class pig implements IB,IC{
    @Override
    public void hi() {

    }

    @Override
    public void cry() {

    }
}
