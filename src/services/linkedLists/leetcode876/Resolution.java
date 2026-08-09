package services.linkedLists.leetcode876;

public class Resolution {
    public static ListNode middleNode(ListNode head){
        ListNode ahead = head;

        while(ahead != null && ahead.next != null){
            ahead = ahead.next.next;
            head = head.next;
        }

        return head;
    }

}
