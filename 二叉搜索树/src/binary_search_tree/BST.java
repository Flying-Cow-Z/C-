package binary_search_tree;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * zrdn:张彪
 * 2020/11/2
 * 19:10
 */
public class BST {
    private Node root; //根
    public BST() {
        root = null;
    }

    //查找
    public boolean search (Integer key) {
        Node cur = root;//特殊情况 空树也满足，只有一个节点也满足

        while (cur != null) {
            int cmp = key.compareTo(cur.key);
            if (cmp == 0) {
                return true;
            }else if (cmp<0) {
                cur = cur.left;
            }else {
                cur = cur.right;
            }
        }
        return false;
    }

    //插入
    public void insert(Integer key) {
        Node parent = null;
        Node cur = root;

        if (root == null){
            root = new Node(key);
            return;
        }
        int cmp = 0;
        while (cur != null) {
            cmp = key.compareTo(cur.key);
            if (cmp == 0){
                throw new RuntimeException("BST中不允许出现相同的key");
            }else if (cmp<0) {
                parent = cur;
                cur = cur.left;
            }else{
                parent = cur;
                cur = cur.right;
            }
        }
        Node node = new Node(key);
        if (cmp<0) {
            parent.left = node;
        }else {
            parent.right = node;
        }
    }

    //删除
    public boolean remove(Integer key) {
        //1.查找要删除key所在的节点，记作node node双亲节点为parent
        Node parent = null;
        Node cur = root;

        while (cur != null) {

            int cmp = key.compareTo(cur.key);
            if (cmp == 0) {
                removeInternal(cur,parent);
                return true;
            }else if (cmp<0){
                parent = cur;
                cur = cur.left;
            }else {
                parent = cur;
                cur = cur.right;
            }

        }
        return false;
    }
    private void removeInternal(Node node,Node parent) {
        //node是要删除的节点
        //第一种情况：叶子节点
        if (node.left == null && node.right == null) {
            if (node == root){
                root = null;
            }else if (node == parent.left){
                parent.left = null;
            }else{
                parent.right = null;
            }
        }else if (node.left != null && node.right == null) {
                if(node == root) {
                    root = node.left;
                }else if(node == parent.left){
                    parent.left = node.left;
                }else{
                    parent.right = node.left;
                }
        }else if(node.left == null && node.right != null) {
                if (node == root){
                root = node.right;
                }else if(node == parent.left){
                    parent.left = node.right;
                }else{
                    parent.right = node.right;
                }
        }else{
            //替换法，使用node左子树最大值所在的节点，记作ghost
            Node ghostparent = node;
            Node ghost = node.left;

            while (ghost.right !=null) {
                ghostparent = ghost;
                ghost = ghost.right;
            }
            //替换
            node.key = ghost.key;
            //删除
            if(node == ghostparent) {
                ghostparent.left = ghost.left;
            }else {
                ghostparent.right = ghost.left;
            }

        }

    }

}
