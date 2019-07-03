package easy.linkedLists.reverseLinkedList;

public class ReverseLinkedList {

    class NodeList {
        int x;
        NodeList next;
        public NodeList(int x) {
            this.x = x;
        }
    }

    static NodeList reverseLinkedList(NodeList head) {
        NodeList current = head;
        NodeList next = null;
        NodeList previous = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

}
