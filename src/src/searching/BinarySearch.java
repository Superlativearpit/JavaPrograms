package src.searching;

public class BinarySearch {
    public void BinarySearch(int arr[], int key) {
        int first = 0;
        int last = arr.length;
        int count = -1;

        while (first <= last) {
            int middle = (first + (last - 1)) / 2;
            if(arr[middle] == key) {
                System.out.println("Element found at " + "index " + middle);
                count = 1;
                break;
            } else if(arr[middle] > key) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }
        if(count == -1) {
            System.out.println("Element not present.");
        }

    }
}
