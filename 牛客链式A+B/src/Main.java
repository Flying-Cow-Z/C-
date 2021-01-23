import java.util.*;

//牛客链式A+B

public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Main {
    public ListNode plusAB(ListNode a, ListNode b) {
        int aValue=listNodeConvertIntValue(a);
        int bVlaue=listNodeConvertIntValue(b);
        int sumValue=aValue+bVlaue;
        return intValueConvertListNode(sumValue);
    }
    private int listNodeConvertIntValue(ListNode node){
        StringBuilder sb=new StringBuilder();
        ListNode cur=node;
        while(cur!=null){
            sb.append(cur.val);
            cur=cur.next;
        }
        return Integer.parseInt(sb.reverse().toString());
    }
    private ListNode intValueConvertListNode(int value){
        char[] ch=String.valueOf(value).toCharArray();
        ListNode node=new ListNode(Integer.parseInt(String.valueOf(ch[ch.length-1])));
        ListNode cur=node;
        for(int i=ch.length-2;i>=0;i--){
            ListNode newNode=new ListNode(Integer.parseInt(String.valueOf(ch[i])));
            cur.next=newNode;
            cur=newNode;
        }
        return node;
    }
}
