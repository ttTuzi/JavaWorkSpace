package Collection__.Set_.HashSet__;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月07日 3:46 PM
 */

public class HashSetStructure {
    public static void main(String[] args) {
        //创建数据,类型是Node[]
        //Node[] 叫做table
        Node[] table = new Node[16];
        System.out.println("table: " + table);

        //创建节点,并放到table中
        Node john = new Node("john", null);
        table[2] = john;
        Node jackey = new Node("jackey", null);
        Node rose = new Node("rose", null);

        //连接john和jackey和rose,形成链表
        john.next = jackey;
        jackey.next = rose;

        //创建新Node,放到table[3]中
        Node lucy = new Node("lucy", null);
        table[3] = lucy;
    }
}

class Node {
    Object item;  //存放数据
    Node next;    //指针

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
