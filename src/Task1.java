public class Task1 {
    public static void main(String[] args) {
        int array[] = new int[5];
        int a = 12;
        for (int i = 0; i < 5; i++, a++) {
            array[i] = a;
        }
        //Circular Series :-
        for(int i = 0; i < 20; i++) {
            System.out.print(array[i % 5] + ", ");
        }
    }
}
