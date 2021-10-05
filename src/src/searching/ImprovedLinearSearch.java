package src.searching;

public class ImprovedLinearSearch {
    public void ImpSearcher(int a[], int key) {
        int n = a.length;
        int left = 0;
        int right = n-1;
        int q = -1;

        for (left = 0; left <= right; left++, right--) {
            if (a[left] == key) {
                System.out.println("Element is present at index " + left);
                q = 0;
                break;
            } else if (a[right] == key) {
                System.out.println("Element is present at index " + right);
                q = 0;
                break;
            }
        }
        if(q == -1) {
            System.out.println("Element is not present in array");
        }
    }
}
