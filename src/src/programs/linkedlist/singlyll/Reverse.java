package src.programs.linkedlist.singlyll;

public class Reverse extends LinkedList{

    public static void reverse(Node node) {
        Node previous = null;
        Node next = null;
        Node current = head;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }
}
