package src.sorting;

public class CountingSort {
    public void getcsort(int array[], int low, int high) {
        csort(array, low, high);
    }
    private void csort(int array[], int low, int high) {
        int auxLastIndex = high - low;
        int auxiliary[] = new int[auxLastIndex + 1];

        for (int i = 0; i < array.length ; i++) {
            auxiliary[array[i] - low]++;
        }
        int i = 0, j = 0;
        while(j <= auxLastIndex) {
            if(auxiliary[j] != 0) {
                array[i++] = low + j;
                auxiliary[j]--;
            } else {
                j++;
            }
        }
    }
}
