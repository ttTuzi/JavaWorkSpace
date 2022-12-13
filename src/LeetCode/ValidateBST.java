package LeetCode;

import java.util.Iterator;
import java.util.List;

/**
 * @Description: check valid binary search tree
 * @author: Wei Liang
 * @date: 2022年12月10日 1:18 AM
 */
public class ValidateBST {
    public static void main(String[] args) {
        System.out.println(Double.MAX_VALUE);
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(1);
        node.right = new TreeNode(4);
        List<Integer> list = BinaryTreeInorderTraversal.inorderTraversal(node);
        Iterator<Integer> iterator = list.iterator();
        int i =iterator.next();

        while(iterator.hasNext()){
            int j =iterator.next();
            if(i>=j){
                System.out.println("false");;
            }
            i = j;
        }
        System.out.println("t");
    }

}



