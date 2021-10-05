package src.normal;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String args[]) {
        System.out.println("Enter the number of times you want the result : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i <= a; i++) {
            if(i % 15 == 0) {
                System.out.println(i+":FizzBuzz");
            }else {
                if(i % 3 == 0) {
                    System.out.println(i+":Fizz");
                } else if (i % 5 == 0) {
                    System.out.println(i+":Buzz");
                }
            }

        }
    }
}
