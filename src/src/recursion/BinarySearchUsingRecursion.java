package src.recursion;

public class BinarySearchUsingRecursion {
    public static int binarySearch(int a[], int left, int right, int x) {
        if(left > right) {
            return -1;
        }
        //Partition
        int mid = (left + right) / 2;

        //If the key Is Mid Value Itself.
        if(x == a[mid])
            return mid;

        //If the Key Exists under Mid Value.
        if(x < a[mid])
            return binarySearch(a, left, mid - 1, x);

        //If The Key Exists above Mid Value.
        return binarySearch(a, mid+1, right, x);
    }

    public static void main(String[] args) {
        int a[] = {8,1,9,7,6,5,4,3,1};
        int z = BinarySearchUsingRecursion.binarySearch(a, 8, 1, 3);
    }
}
