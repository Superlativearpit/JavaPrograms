package src.programs.linkedlist.singlyll;

public class LengthOfList extends LinkedList{
    public static int lengthOfLL() {
        Node current = head;
        int count = 0;
        while (current != null) {
            ++count;
            current = current.next;
        }
        return count;
    }
}
