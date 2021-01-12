//牛客反转链表

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Main {
    public ListNode ReverseList(ListNode head) {
        ListNode nhead = null;
        while(head!=null){
            ListNode tmp = head.next;
            head.next = nhead;
            nhead = head;
            head = tmp;
        }
        return nhead;
    }
}