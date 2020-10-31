/**
 * Created with IntelliJ IDEA.
 * Description:
 * zrdn:张彪
 * 2020/10/8
 * 9:57
 */

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class MylinkedList {
    public Node head;

    //打印链表
    public void  display() {
      Node cur = this.head;
      while (cur != null) {
          System.out.print(cur.data + " ");
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
//=============================================================
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        Node node = new Node(data);

        if (checkIndex(index) == false) {
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == getLength()) {
            addLast(data);
            return;
        }
        Node cur = getPrev(index);
        node.next = cur.next;
        cur.next = node;
    }
    //检查下标是否合法
    public boolean checkIndex(int index) {
        if (index < 0 || index > this.getLength()) {
            System.out.println("下标不合法！");
            return false;
        }
        return true;
    }
    //求链表长度
    public int getLength() {
        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
    //找前驱节点 1
    public Node getPrev(int index) {
        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            if (index-1 == count){
                break;
            }
            cur = cur.next;
            count++;
        }
        return cur;
    }
//=============================================================
    //删除第一次出现关键字为key的节点

    /**
     * a.第一个节点是要删除的节点
     * b.其他情况
     *
     * 找前驱节点并返回
     * @param key
     */

    public void remove(int key) {

        if (this.head == null) return;
        if (key == this.head.data){
            this.head = this.head.next;
            return;
        }

        //Node cur1 = contains(key);
        Node cur = searchPrev(key);
        if (cur == null){
            System.out.println("没有你要删除的数字");
            return;
        }
        Node del = cur.next;
        cur.next = del.next;

    }
//    public Node contains(int key) {
//        Node cur = this.head;
//        while (cur != null) {
//            if (cur.data == key) {
//                return cur;
//            }
//            cur = cur.next;
//        }
//        return null;
//    }
    //找前驱节点 2
    public Node searchPrev(int key){
        Node cur = this.head;

        while (cur.next != null) {
            if (cur.next.data == key){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    //==================================================================
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        //普通做法
//        Node cur = this.head;
//        while(cur != null) {
//            if (key == cur.data){
//                remove(key);
//            }
//
//            cur = cur.next;
//        }
        //巧妙做法:只遍历单链表一次

        if(this.head == null) return;
        Node prev = this.head;
        Node cur = this.head.next;
        while (cur != null) {
            if (cur.data == key){
              prev.next = cur.next;
              cur = cur.next;
            }else {
               prev = cur;
               cur = cur.next;
            }
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }
    }

    //=========================================
    //清空链表
    public void clear(){
        this.head = null;
    }
}
