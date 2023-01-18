package reflection_;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 1/17/2023 8:40 PM
 */
public class Cat {
    private String name = "lucky cat";
    public int age = 10;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public void hi(){
        System.out.println(name + ": hi");
    }
    public void cry(){
        System.out.println(name + ": cry");
    }
}
