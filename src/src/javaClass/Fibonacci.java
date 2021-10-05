package src.javaClass;

class Fibonacci{
    public static void main(String args[]) {
        int first = 0, second = 1, c = 0;
        int n = Integer.parseInt(args[0]);
        System.out.print(first +" "+ second);
        for (int i = 1; i < n - 1; i++) {
            c = first + second;
            first = second;
            second = c;
            System.out.print(" "+ c);
        }
    }
}