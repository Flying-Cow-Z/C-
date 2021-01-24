
//实现一个函数，检查二叉树是否平衡，平衡的定义如下，对于树中的任意一个结点，其两颗子树的高度差不超过1。
//给定指向树根结点的指针TreeNode* root，请返回一个bool，代表这棵树是否平衡。


import javax.swing.tree.TreeNode;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class Balance {
    public boolean isBalance(TreeNode root) {
        // write code here
        return Math.abs(high(root.right)-high(root.left))>1?false:true;
    }
    int high(TreeNode node){
        if (node==null){
            return 0;
        }
        return Math.max(high(node.left),high(node.right))+1;
    }

}