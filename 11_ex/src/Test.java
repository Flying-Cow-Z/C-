/**
 * Created with IntelliJ IDEA.
 * Description:
 * zrdn:张彪
 * 2020/7/28
 * 10:24
 */
class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class MyLinkedList {

    public Node head;//标识单链表的头节点

    //public int usedSize;
    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        /*if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }*/
        node.next = this.head;
        this.head = node;
    }

    public void display() {

    }

}

