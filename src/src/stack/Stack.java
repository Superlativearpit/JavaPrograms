package src.stack;

public class Stack {
    static final int space = 100;
    int top;
    int i[] = new int[space];
    Stack(){
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    public void push(int number) {
        if(top >= space - 1) {
            System.out.println("Stack Overflow");
        } else {
            top = top + 1;
            i[top] = number;
            System.out.println(number + " is pushed in the stack.");
        }
    }

    public void pop() {
        if(top < 0) {
            System.out.println("Stack Underflow.");
        } else {
            int x = i[top];
            i[top] = i[top - 1];
            System.out.println(x + " has been popped.");
        }
    }

    public void peek() {
        if(top < 0) {
            System.out.println("Stack Underflow.");
        } else {
            System.out.println(i[top]);
        }
    }
}
