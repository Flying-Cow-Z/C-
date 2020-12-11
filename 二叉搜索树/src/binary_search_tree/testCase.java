package binary_search_tree;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * zrdn:张彪
 * 2020/11/2
 * 20:28
 */
public class testCase {
    public static void main(String[] args) {
     BST tree = new BST();

        tree.insert(5);
        tree.insert(6);
        tree.insert(8);
        tree.insert(0);
        tree.insert(9);
        tree.insert(1);
        tree.insert(2);
        tree.insert(4);
        tree.insert(3);
        tree.insert(7);
        tree.insert(10);

        //因为不好展示树，所以打断点，debug观察
        System.out.println("hello");
        //测试search方法
        for (int i=-1;i<=11;i++){
            System.out.println(i + ":" + tree.search(i));
        }
        //检查异常
        tree.insert(10);
        //检查空树
        System.out.println(new BST().search(10));
    }
}
