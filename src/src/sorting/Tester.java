package src.sorting;

public class Tester {
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " , ");
        }

    }

    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("Before Sorting : ");
        printArray(arr);
        ob.bubbleSort(arr);
        System.out.print("After Sorting array : ");
        printArray(arr);
    }
}
