package services.linkedLists.leetCode206;

public class Resolution {
    public static ListNode reverseList(ListNode head){
        ListNode new_list = null;

        while(head != null){
            ListNode next_node = head.next;
            head.next = new_list;
            new_list = head;
            head = next_node;
        }

        return new_list;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

}
