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

    public static void sort(Comparable[] a) {
        int n = a.length;
        for(int i = 0; i <= n; i++) {
            int min = i;
            for(int j = i + 1; j < n; j++) {
                if(less(a[i], a[min]))
                    min = j;
                exch(a, i, min);
            }
        }
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
}
