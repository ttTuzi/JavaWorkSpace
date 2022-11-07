package Collection__.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月06日 5:25 PM
 */
public class Exercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("三国演义","罗贯中",100));
        list.add(new Book("小李飞刀","古龙",51));
        list.add(new Book("红楼梦","曹雪芹",346));
        list.add(new Book("水浒传","施耐庵",78));
        list.add(new Book("水浒传","施耐庵",81));
        list.add(new Book("水浒传","施耐庵",18));

        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("============");
        sortPrice(list);
        for (Object o : list) {
            System.out.println(o);
        }
    }

    //sort List
    public static List sortPrice(List list){
        for(int i=0;i<list.size();i++){
            int min = i;
            for(int j=i+1;j< list.size();j++){
                Book book1 = (Book) list.get(min);
                Book book2 = (Book) list.get(j);
                if(book1.getPrice()>book2.getPrice()){
                    list.set(min,book2);
                    list.set(j,book1);
                }
            }
        }
        return list;
    }
}

class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}