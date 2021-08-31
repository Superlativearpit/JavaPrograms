package src.programs.linkedlist.singlyll;



public class NewPrint extends LinkedList{
    public static void printL() {
        for(Node current = head; current != null; current = current.next) {
            System.out.print(current.data+", ");
        }
        System.out.println();
    }
}
