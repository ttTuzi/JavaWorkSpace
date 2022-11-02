package Arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年10月31日 2:55 PM
 */
public class ArraysExercise {
    public static void main(String[] args) {
        Book[] book = new Book[4];
        book[0] = new Book("射雕英雄传",100);
        book[1] = new Book("水浒传",90);
        book[2] = new Book("斗破苍穹",5);
        book[3] = new Book("大奉打更人",300);

        //根据价格来排序
        Arrays.sort(book, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                double val = o1.getPrice()-o2.getPrice();
                if(val<=0){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        System.out.println(Arrays.toString(book));

        //根据名字长短排序
        Arrays.sort(book, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.toString().length()-o2.toString().length();
            }
        });
        System.out.println(Arrays.toString(book));

    }
}

class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
