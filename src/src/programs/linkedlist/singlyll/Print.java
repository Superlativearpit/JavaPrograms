package src.programs.linkedlist.singlyll;

public class Print extends LinkedList{
    public static void printLL(String a) {
        System.out.print(a+"");
        for(Node current = head; current != null; current = current.next) {
            System.out.print(current.data+", ");
        }
        System.out.println();
    }
    public static void printL() {
        for(Node current = head; current != null; current = current.next) {
            System.out.print(current.data+", ");
        }
        System.out.println();
    }
}
