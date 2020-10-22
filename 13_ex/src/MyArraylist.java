/**
 * Created with IntelliJ IDEA.
 * Description:
 * zrdn:张彪
 * 2020/8/4
 * 9:45
 */

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

}
public class MyArraylist {
    //头插法
    public Node head;//标识单链表的头结点
    public void addFirst(int data) {
        Node node = new Node(data);
        /**
         * 当链表没数据时，即head为null
         * if(this.head == null) {
         *     this.head = node;
         * }else {
         *     node.Next = this.head;
         *     this.head = node;
         * }
         */
        node.next = this.head;
        this.head = node;
    }

    public void display() {
        Node cur =  this.head;
        while(cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //找尾巴
    public Node Fun(Node cur){
        while (cur.next != null){
            cur = cur.next;
        }
        return cur;
    }
    //尾插法
    public void Tail(int data){
        Node node = new Node(data);

        if (head == null) {
            this.head = node;
        }else {
            //找尾巴
            Node cur = this.head;
            Fun(cur).next = node;
           /* 或者
            while (cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
            */
        }
    }
    //任意位置插入
    public void addIndex(int data,int index){
        if (index < 0 || index > getLength()){
            System.out.println("位置不合法！");
            return;
        }
        if(index == 0) {
            addFirst(data);
            return;
        }
        if (index == getLength()) {
            Tail(data);
            return;
        }

        Node node = new Node(data);
        Node cur  = searchPrev(index);
        node.next = cur.next;
        cur.next = node;

    }
    //寻找前驱
    public Node searchPrev(int index) {
        Node cur = this.head;
        int count = 0;
        while (count < index-1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }
    public int getLength(){
        Node cur = this.head;
        int count = 0;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //删除节点（删除第一次出现的数字）

    //查找关键字key的前驱节点（删除部分）
    public Node searchPrevNode(int key) {
        Node cur = this.head;
        while(cur.next != null) {
            if (cur.next.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    public void remove(int key) {
       // Node cur = this.head;
        if (this.head == null)
            return;
        if (this.head.data == key ) {
            this.head = this.head.next;
            return;
        }else {
            Node node = searchPrevNode(key);
            if (node == null) {
                System.out.println("没有要删除的数字");
                return;
            }
//            Node del = node.next;
//            node.next = del.next;
            node.next = funv(key).next;
        }
    }
    public Node funv(int key) {
        Node node = this.head;
        while(node != null) {
            if (node.data == key) {
                return node;
            }
         node = node.next;
        }
        return null;
    }
    //判断链表是否存在关键字key
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
   //删除所有关键字key
    //要求只遍历一遍
    public void removeAllkey(int key) {
       if (this.head == null){
           return ;
       }
        Node prev = this.head;
        Node cur = prev.next;

        while(cur != null) {
            if (cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }
    }
    //清空链表
        public void clear(){
        this.head = null;
}
    //只遍历链表一遍，做到逆置链表
        public Node reverseList() {
        Node prev = null;
        Node cur = this.head;
        Node newHead = null;//新链表的头节点

        while (cur != null) {
          Node  curNext = cur.next;
            if (curNext == null){
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;

        }
            return newHead;
        }
        public Node display2(Node newHead){
        Node cur = newHead;
        while (cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
            System.out.println();
        return newHead;
        }
        //找中间节点
        public Node middleNode(Node head) {
            Node fast = this.head;
            Node slow = this.head;
            while (fast !=null && fast.next != null ){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        //输出链表中倒数第k个节点
    public Node printK(Node head ,int k) {
        if (k <= 0 || head == null ) return null;
        Node slow = this.head;
        Node fast = this.head;

        while (0<k-1){
            if (fast.next == null){
                fast = fast.next;
                k--;
            }else{
                System.out.println("K值过大");
                return null;
            }


        }
        while (fast.next != null){
            slow = slow.next;
            fast = slow.next;
        }
        return slow;
    }
}
