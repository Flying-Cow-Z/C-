//牛客反转链表
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
//         ListNode pre = null;
//         ListNode next = null;
//         while(head != null) {
//             next = head.next;
//             head.next = pre;
//             pre = head;
//             head = next;
//         }
//         return pre;
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newNode = ReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
}