/**
 * Created with IntelliJ IDEA.
 * Description:
 * zrdn:张彪
 * 2020/10/17
 * 11:01
 */

class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}
public class MyLinkedList {
    public Node head;

    //打印链表
    public void  display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();

    }

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);

       /* 或者
       if (this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }*/
        node.next = this.head;
        this.head = node;
    }
    //=============================================================
    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;

        if (this.head == null) {
            this.head = node;
        }else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
            node.next = null;
        }
    }
    //======================================

    //链表逆置
    //方法1：.头插法
//    public Node reverseList2(head) {
//
//        Node puppet = new Node(-1);//new一个傀儡节点
//        Node cur = this.head;
//
//        //遍历链表
//        while (cur != null) {
//            Node puppetNext = puppet.next; //保存傀儡节点的下一个节点
//            Node curNext = cur.next;       //保存链表的下一个节点，防止链表丢失
//
//            puppet.next = cur;              //傀儡节点的next引用指向的对象指向cur
//            cur.next = puppetNext;          //将傀儡节点的下一个赋值给cur.next，从而得以连接
//            cur = curNext;                  //此时将cur后移找下个，继而循环
//        }
//          return puppet.next;
//
//    }
    //方法2：
    public Node reverseList(){
        Node prev = null;   //前驱
        Node newHead = null;//新节点
        Node cur = this.head;//需要反转的节点

        while (cur != null) {
            Node curNext = cur.next;
            if (curNext == null) {
                newHead = cur;

            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }

        return newHead;
    }
    public void  display2(Node newHead) {
        Node cur = newHead;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();

    }
//============================================
    //找中间节点
    public Node middleNode(Node head){
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
        }
        return slow;
    }

    //返回链表的倒数第k个节点
    public Node findKthToTail(int k) {
        Node slow = this.head;
        Node fast = this.head;
        if(k <= 0){
            return null;
        }
        while (k-1 > 0){
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
