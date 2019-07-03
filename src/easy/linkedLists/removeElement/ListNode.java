package easy.linkedLists.removeElement;

public class ListNode {
    protected ListNode next;
    protected int val;

    protected ListNode(int val) {
        this.val = val;
    }

    protected static ListNode removeElement(ListNode head, int value) {
        ListNode current = head;
        ListNode previous = null;
        while (current != null) {
            if (current.val == value) {
                if (previous == null) {
                    head = head.next;
                } else {
                    previous.next = current.next;
                }
            } else {
                previous = current;
            }
            current = current.next;
        }
        return head;
    }

}
