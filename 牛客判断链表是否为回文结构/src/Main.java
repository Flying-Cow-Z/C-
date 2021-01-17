//牛客给一个链表，判断是否为回文结构

import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Solution {
    /**
     *
     * @param head ListNode类 the head
     * @return bool布尔型
     */
    public boolean isPail (ListNode head) {
        // write code here
        Deque<Integer> que=new LinkedList<Integer>();
        while(head!=null) {
            que.add(head.val);
            head=head.next;
        }
        while(que.size()>1) {
            if(!que.pollFirst().equals(que.pollLast()))
                return false;
        }
        return true;
    }
}