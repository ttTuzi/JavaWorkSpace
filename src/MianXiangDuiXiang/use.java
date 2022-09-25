package MianXiangDuiXiang;
import java.util.*;
public class use {
    public static void main(String[] args) {
        //construce a new object
        People p1 = new People();
        p1.setAge(5);
        p1.setName("Eric");
        p1.tostring();
        //out put is same is because p2=p1 means they point to same memory address
        People p2 = new People(20,"William");
        p2=p1;
        p2.tostring();
    }
}



