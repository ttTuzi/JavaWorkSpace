package generics_.CustomGeneric;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月11日 2:52 PM
 */
public class CustomInterfaceGenerics_ {
    public static void main(String[] args) {

    }
}

interface IUsb<U,R>{
    R get(U u);

    void hi(R r);

    default R method(U u){
        return null;
    }
}

interface AI extends IUsb<String,Double>{

}

class AA implements AI {
    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }
}