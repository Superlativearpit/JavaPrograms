package src.programs.linkedlist.link;

public class JoinAtEnd {
    Node head;
    Node tail;

    class Node{
        Node next;
        int data;

        Node(int d) {
            this.data = d;
        }
    }
    public void joinAt(Node head, Node tail, int key) {
        Node tail1 = tail;
        Node current;

        for (current = head; current != tail; current = current.next) {
            if(current.data == key) {

            }
        }

    }


}
