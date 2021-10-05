package src.sorting;

public class SelectionSort {
    public void getSsorted(int array[]) {
        sSort(array);
    }

    private void sSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minimum = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minimum]) {
                    minimum = j;
                }
            }
            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
        }
    }

}
