package src.sorting;

public class MergeSort {
    public void sort(int array[]) {
        //Divide this array into half.
        if(array.length < 2) {
            return;
        }

        int middle = array.length/2;

        int left[] = new int[middle];
        for(int i = 0; i < middle; i++) {
            left[i] = array[i];
        }

        int right[] = new int[array.length-middle];
        for(int i = middle; i < array.length; i++) {
            right[i-middle] = array[i];
        }

        //Sort each Half.
        sort(left);
        sort(right);

        merge(left, right, array);
    }
    //Copy
    private void merge(int left[], int right[], int result[]) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }

            while (i < left.length) {
                result[k++] = left[i++];
            }
            while(j < right.length) {
                result[k++] = right[j++];
            }

    }
}
