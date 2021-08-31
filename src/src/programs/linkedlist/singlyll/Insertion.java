package src.programs.linkedlist.singlyll;

public class Insertion extends LinkedList{
   public static void insertAtFront(int d) {
       Node newNode = new Node(d);
       newNode.next = head;
       head = newNode;
   }
   public static void insertAtEnd(int d) {
       Node newNode = new Node(d);

       if (head == null)
       {
           head = new Node(d);
           return;
       }

       newNode.next = null;
       Node last = head;

       while (last.next != null) {
           last = last.next;
       }

       last.next = newNode;
       return;
   }

   public static void insertAtGivenPosition(Node previous,int d) {
       if (previous == null)
       {
           System.out.println("The given previous node cannot be null");
           return;
       }

       Node newNode = new Node(d);
       newNode.next = previous.next;
       previous.next = newNode;
   }
}
