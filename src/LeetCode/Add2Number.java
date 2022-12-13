package LeetCode;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月05日 12:27 PM
 */
public class Add2Number {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode();
        ListNode listNode2 = new ListNode();
        listNode1.val=2;
        listNode1.next=new ListNode(4);
        listNode1.next.next = new ListNode(3);
        listNode2.val=5;
        listNode2.next=new ListNode(6);
        listNode2.next.next = new ListNode(4);
        ListNode node = addTwoNumbers(listNode1,listNode2);
        while(node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int carry =0;
        ListNode result = new ListNode();
        ListNode curr = result;
        while(l1!=null || l2!=null || carry==1){
            int sum = 0;
            if(l1!=null && l2!=null){
                sum = sum + l1.val +l2.val+ carry;
                l1=l1.next;
                l2=l2.next;
            }
            else if(l2!=null){
                sum = sum +l2.val+carry;
                l2=l2.next;
            }
            else if(l1!=null){
                sum = sum +l1.val+carry;
                l1=l1.next;
            }
            else if(carry==1){
                sum=sum+carry;
            }
            if(sum>=10){
                sum = sum%10;
                carry=1;
            }else{
                carry=0;
            }

            ListNode node1 = new ListNode(sum);
            result.next = node1;
            result = result.next;
        }
        return curr.next;
    }


}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}