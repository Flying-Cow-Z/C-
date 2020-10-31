/**
 * Created with IntelliJ IDEA.
 * Description:
 * zrdn:张彪
 * 2020/10/8
 * 9:58
 */
public class TestDemo {
    public static void main(String[] args) {
        MylinkedList mylinkedList = new MylinkedList();
        mylinkedList.addFirst(1);
        mylinkedList.addFirst(2);
        mylinkedList.addFirst(4);

        mylinkedList.display();

        mylinkedList.addLast(3);
        mylinkedList.addLast(4);
        mylinkedList.addLast(4);
        mylinkedList.addLast(4);

        mylinkedList.display();

        mylinkedList.addIndex(2,11);
        mylinkedList.addIndex(3,14);

        mylinkedList.display();
        System.out.println("======================");
        mylinkedList.removeAllKey(4);

        mylinkedList.display();
    }




}
