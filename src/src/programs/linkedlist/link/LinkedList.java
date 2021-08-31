package src.programs.linkedlist.link;

public class LinkedList {
    Node head;
    Node tail;
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    public void insertOnFront(int d) {
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
    }
    public void print() {
        for(Node current = head; current != null; current = current.next) {
            System.out.print(current.data+", ");
        }
        System.out.println();
    }


    public static void main(String args[]) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.insertOnFront(9);
        l1.insertOnFront(5);
        l1.insertOnFront(3);
        Node head1 = l1.head;

        l2.insertOnFront(10);
        l2.insertOnFront(4);
        l2.insertOnFront(2);
        Node head2 = l2.head;

        l1.print();
        l2.print();

        System.out.println(head1.data);
        System.out.println(head2.data);



    }
}
