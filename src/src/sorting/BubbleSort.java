package src.sorting;

public class BubbleSort {
    public void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + ", ");
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = {89, 2, 85, 96, 37, 67};
        BubbleSort bsorted = new BubbleSort();
        bsorted.bubbleSort(a);
        bsorted.printArray(a);
    }
}
