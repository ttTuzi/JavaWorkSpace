package Collection__.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月06日 4:07 PM
 */
public class CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("红楼梦","罗贯中",10.1));
        col.add(new Book("小李飞刀","古龙",5.1));
        col.add(new Book("红楼梦","曹雪芹",34.6));
        System.out.println("col:"+col);
        //希望遍历cal集合
        //1.得到对应集合的迭代器
        Iterator iterator = col.iterator();
        //2.使用while循环遍历
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());

        }
        //3.快捷键快速生成 while: itit
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next.toString());
        }

        //当迭代器退出后循环后,我们的迭代器指向了最后的元素
        //我们如果再使用迭代器,会出错
        //迭代器的指针是永久的,并不会重置
        //如果想重置指针,就让迭代器重新指向Collection.iterator
        iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next.toString());
        }

        //还可以使用增强for循环
        for (Object book : col) {
            System.out.println(book.toString());
        }

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
