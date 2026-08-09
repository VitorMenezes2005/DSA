package services.linkedLists.leetCode141;

public class Resolution {
    public boolean hasCycle(ListNode head){
        ListNode head2 = head;

        while(head2 != null && head2.next != null){
            head2 = head2.next.next;
            head = head.next;

            if(head2 == head){
                return true;
            }
        }

        return false;
    }

}
