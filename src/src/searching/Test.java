package src.searching;

public class Test {
    public static void main(String[] args) {
        int a[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        //Linear Search :
        LinearSearch lc = new LinearSearch();
        lc.LSearch(a, 61);

        //Linear Search Improved :
        ImprovedLinearSearch iLs = new ImprovedLinearSearch();
        iLs.ImpSearcher(a, 0);

        //Binary Search :
        BinarySearch bc = new BinarySearch();
        bc.BinarySearch(a, 91);

        JumpSearch j = new JumpSearch();
        int index = j.JpSearch(a, 44);
        System.out.println(index);
    }
}
