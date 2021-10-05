package src.searching;

public class LinearSearch {
    public void LSearch(int a[], int key) {
        int r = 0;
        int i;
        for(i = 0; i < a.length; i++) {
            if(a[i] == key) {
                r++;
                break;
            }
        }
        if(r != 1) {
            r = -1;
        }
        if (r == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + i);
        }
    }
}
