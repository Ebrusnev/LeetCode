package easy.linkedLists.removeDuplicates;

public class ListNode {

    protected ListNode next;
    protected int val;
    protected ListNode(int val) {
        this.val = val;
    }

    protected static ListNode removeDuplicates(ListNode head) {
        if (head != null && head.next != null) {
            ListNode current = head;
            ListNode next = head.next;
            while(next != null) {
                if (current.val == next.val) {
                    next = next.next;
                    current.next = next;
                } else {
                    current = next;
                    next = next.next;
                }
            }
        }
        return head;
    }

}
