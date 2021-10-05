package src.javaClass;


import java.util.Scanner;
public class ScannerDemo {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();
        input.nextLine();
        System.out.println(age);

        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println(name);
    }
}