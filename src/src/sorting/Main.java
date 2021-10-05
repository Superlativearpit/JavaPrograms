package src.sorting;

public class Main {
    public static void main(String[] args) {
        int arr[] = {7,3,5,2,3,1,5,8};
        MergeSort msort = new MergeSort();
        msort.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" " );
        }

    }
}
