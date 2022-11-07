package Collection__.list_;

import java.util.LinkedList;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月07日 1:39 PM
 */
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);

        //源码阅读:
        /*1.LinkedList linkedList = new LinkedList();
                public LinkedList(){}

          2.这时first=null, last = null
          3.然后执行add方法
                public boolean add(E e){
                    linkLast(e);
                    return true;
                }
                //linkLast方法
                void linkLast(E e) {
                    final Node<E> l = last;  //把last给l
                    final Node<E> newNode = new Node<>(l, e, null);//创建一个新node,新node属性是(pre,e,next),last就成新node的pre,element就是e,next就是null
                    last = newNode;//然后把last指向new node
                    if (l == null) //如果现在是添加的第一个元素,那么l是null
                        first = newNode; //所以把first也赋给newNode
                    else
                        l.next = newNode; //否则就把现在的node指向new Node
                    size++;
                    modCount++;
            }
        */
    }
}
