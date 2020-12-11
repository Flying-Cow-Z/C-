package binary_search_tree;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * zrdn:张彪
 * 2020/11/2
 * 19:08
 */
public class Node {
            public Integer key;
            Node left;
            Node right;
            public Node(Integer key){
                this.key = key;
            }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
