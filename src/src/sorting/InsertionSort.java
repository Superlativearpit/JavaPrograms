package src.sorting;

public class InsertionSort {
    public void getIsorted(int array[]) {
        iSort(array);
    }
    private void iSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int previous = i - 1;

            while(previous >= 0 && array[previous] > current) {
                array[previous + 1] = array[previous];
                previous = previous - 1;
            }
            array[previous + 1] = current;
        }
    }
}
