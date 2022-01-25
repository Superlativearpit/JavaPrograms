package src.testWork;
 /*
 The JVM firstly checks whether the exception is handled or not.
 If exception is not handled, JVM provides a default exception handler that performs
 the following tasks:
    Prints out exception description.
    Prints the stack trace (Hierarchy of methods where the exception occurred).
    Causes the program to terminate.

 But if the application programmer handles the exception, the normal flow of the application
 is maintained, i.e., rest of the code is executed.
 * */

public class ExHandling {
    public static void main(String[] args) {
        /*Java try block is used to enclose the code that might throw an exception.
         It must be used within the method.
         If an exception occurs at the particular statement in the try block,
         the rest of the block code will not execute.
         So, it is recommended not to keep the code in try block that will not throw an exception.
         */
        try {
            int a = 30, b = 0;
            int c = a / b;
            System.out.println("result = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Can't Divide a number by zero.");
        }

        /*
        Java catch block is used to handle the Exception by declaring the type of exception within
        the parameter.
        The declared exception must be the parent class exception ( i.e., Exception) or
        the generated exception type.
        However, the good approach is to declare the generated type of exception.
        The catch block must be used after the try block only.
        You can use multiple catch block with a single try block.
        */
        try {
            avg();
        } //catch (ArithmeticException e) {
        // System.out.println("Arithmetic Exception Arises.");
        //}


        /*
        Java finally block is a block used to execute important code such as closing the connection, etc.
        Java finally block is always executed whether an exception is handled or not.
        Therefore, it contains all the necessary statements that need to be printed regardless of the
        exception occurs or not.
        The finally block follows the try-catch block.
        * */ finally {
            //    System.out.println("Caught.");
            //}
            try {
                try {
                    int num = Integer.parseInt("Arpit");
                    System.out.println(num);
                } catch (NumberFormatException e) {
                    System.out.println("Number Format Exception.");
                }

                try {
                    int a[] = new int[5];
                    a[7] = 0;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array Index Out of Bound");
                }

                System.out.println("Both are handled.");

            } catch (Exception e) {
                System.out.println("All Exceptions are being Handled. ");
            }

            try {
                int a[] = new int[5];
                a[7] = 0;
            } finally {
                System.out.println("This will always be Executed.");
            }
        }
    }


    /*
    The Java throws keyword is used to declare an exception.
    It gives an information to the programmer that there may occur an exception.
    So, it is better for the programmer to provide the exception handling code so that the normal
    flow of the program can be maintained.
    Exception Handling is mainly used to handle the checked exceptions.
    If there occurs any unchecked exception such as NullPointerException,
    it is programmers' fault that he is not checking the code before it being used.
    * */
    static void avg() throws ArithmeticException {
        System.out.println("Inside avg Function.");
        /*
        The Java throw keyword is used to throw an exception explicitly.
        We specify the exception object which is to be thrown. The Exception has some message with it that
        provides the error description. These exceptions may be related to user inputs, server, etc.
        We can throw either checked or unchecked exceptions in Java by throw keyword.
        It is mainly used to throw a custom exception.
        We can also define our own set of conditions and throw an exception
        explicitly using throw keyword. For example, we can throw ArithmeticException if we divide
        a number by another number. Here, we just need to set the condition and throw
        exception using throw keyword.
        * */
        throw new ArithmeticException("Demo");
    }
}
