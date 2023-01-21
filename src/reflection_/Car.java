package reflection_;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年01月18日 12:44 PM
 */
public class Car {
    public String brand;
    public int price;
    public String color;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
