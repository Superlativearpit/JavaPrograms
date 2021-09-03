package src.programs.linkedlist.link;

/**
 * This is the primary Linked list class, we have to add all the operations here.
 */
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
        for (Node current = head; current != null; current = current.next) {
            System.out.print(current.data + ", ");
        }
        System.out.println();
    }

    public Node merge(Node head1, Node head2) {
        if(head1.next == null) {
            head1.next = head2;
            return head1;
        }
        Node current1 = null;
        Node current2 = null;
        Node next1 = null;
        Node next2 = null;

        if(head1.data < head2.data) {
            current1 = head1;
            current2 = head2;
            next1 = head1.next;
            next2 = head2.next;
        } else {
            current1 = head2;
            current2 = head1;
            next1 = head2.next;
            next2 = head1.next;
        }
         while(next1 != null && current2 != null) {
             if(current2.data >= current1.data && current2.data <= next1.data) {
                 next2 = current2.next;
                 current1.next = current2;
                 current2.next = next1;
                 current1 = current2;
                 current2 = next2;
             } else {
                 if(next1.next != null) {
                     next1 = next1.next;
                     current1 = current1.next;
                 } else {
                     next1.next = current2;
                     return head1;
                 }
             }
         }
         return head1;
    }

    public Node merge1(Node head1, Node head2) {
        Node temp = new Node(0);
        Node prev = temp;

        Node l1 = null;
        Node l2 = null;

        if(head1.data < head2.data) {
            l1 = head1;
            l2 = head2;
        } else {
            l1 = head2;
            l2 = head1;
        }

        Node c1 = l1;
        Node c2 = l2;

        while(c1 != null && c2 != null) {
            if(c1.data < c2.data) {
                prev.next = c1;
                c1 = c1.next;
            } else {
                prev.next = c2;
                c2 = c2.next;
            }
            prev = prev.next;
        }
        prev.next = c1 != null ? c1 : c2;
        return head1;
    }

    public static void main(String args[]) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.insertOnFront(30);
        l1.insertOnFront(21);
        l1.insertOnFront(20);
        l1.insertOnFront(10);
        l1.insertOnFront(1);
        Node head1 = l1.head;

        l2.insertOnFront(22);
        l2.insertOnFront(20);
        l2.insertOnFront(4);
        l2.insertOnFront(3);
        l2.insertOnFront(2);
        Node head2 = l2.head;

        l1.print();
        l2.print();

        //System.out.println(head1.data);
        //System.out.println(head2.data);

        l1.merge1(l1.head, l2.head);
        l1.print();
    }
}
