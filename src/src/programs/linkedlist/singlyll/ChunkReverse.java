package src.programs.linkedlist.singlyll;

public class ChunkReverse extends LinkedList {

    public static Node rev(Node head, int key) {
        int length = LengthOfList.lengthOfLL();
        int temp = 0;
        if (head == null) {
            System.out.println("The Linked List Is Empty");
        }
        Node previous = null;
        Node next = null;
        Node current = head;
        int chunk = 1;

        while (current != null && chunk <= key) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            chunk++;
        }
        if (next != null) {
            head.next = rev(next, key);
        }
        return previous;

    }

}
