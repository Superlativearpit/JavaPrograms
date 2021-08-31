package src.programs.linkedlist.singlyll;

public class ReverseList extends LinkedList {
    public static Node reversal(Node head, int key) {
        {
            Node resultant = null;

            int count = LengthOfList.lengthOfLL();

            if (count % key == 0) {
                count = count / key;
            } else {
                count = (count / key) + 1;
            }

            Node temp = head;
            while (count-- > 0) {
                int key1 = key;
                Node next = null;
                Node previous = null;
                Node current = head;
                while (key1-- > 0 && head != null) {
                    head = head.next;
                }
                key1 = key;

                while (key1-- > 0 && current != null) {      // For reverse the linked list
                    next = current.next;
                    current.next = previous;
                    previous = current;
                    current = next;
                }
                key1 = key;
                if (resultant == null) {
                    resultant = previous;
                } else {
                    Node temp1 = resultant;
                    while (temp1.next != null) {
                        temp1 = temp1.next;
                    }
                    temp1.next = previous;
                }
            }
            return resultant;
        }
    }
}
