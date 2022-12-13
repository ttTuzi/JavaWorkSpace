package LeetCode;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description: inorder traversal
 * @author: Wei Liang
 * @date: 2022年12月10日 12:32 AM
 */
public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);
        inorderTraversal(treeNode);

    }
    public static List<Integer> inorderTraversal(TreeNode treeNode){
        List<Integer> list = new ArrayList<>();
        inOrder(treeNode,list);
        return list;
    }
    public static void inOrder(TreeNode node,List<Integer> list){
        if(node!=null){
            inOrder(node.left,list);
            list.add(node.val);
            System.out.println(node.val);
            inOrder(node.right,list);
        }
    }
}

