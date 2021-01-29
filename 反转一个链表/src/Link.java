class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        next = null;
    }

    public boolean isEmpty() {
        return this == null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}


public class Link {
    Node head;

    public void reverse() {
        if (head.isEmpty() || head.next.isEmpty()) return;
        Node cur = head.next;
        Node pre = head;

        while (cur!=null) {
            Node tmp = cur.next;

            cur.next = pre;  //变成了 cur-》pre-》源cur.next节点
            head.next = tmp;
            //2->1->3 c:3 p:2  3->2->4(1节点直接被4覆盖)，需要修改
            pre = cur;
            cur = tmp;
            tmp = null; //垃圾回收
        }
        head = pre;
    }

    public boolean isEmpty() {
        return head == null;
    }

}

