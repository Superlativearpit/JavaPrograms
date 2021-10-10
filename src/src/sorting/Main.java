package src.sorting;

public class Main {
    public static void main(String[] args) {
        int arr[] = {5,7,6,1,3,2,4};
        //QuickSort qsort = new QuickSort();
        //qsort.take(arr);
        MergeSort msort = new MergeSort();
        msort.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" " );
        }

    }
}
