package LeetCode;

public class SameTree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(6);
        System.out.println(isSameTree(p,q));
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        //if it successfully traverses at end, it means not false condition in the path, therefore return true.
        if(p==null && q==null){
            return true;
        }
        //if 1 of them not equal to each other, then return false;
        if((p==null || q==null) || (p.val!=q.val)){
            return false;
        }
        // recursive left and right, and boolean calculate
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}




