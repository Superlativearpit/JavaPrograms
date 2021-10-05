package src.searching;

public class JumpSearch {
    public int JpSearch(int a[], int target) {
        int blockSize = (int) Math.sqrt(a.length);
        int start = 0;
        int next = blockSize;

        while(a[start] < a.length && a[next-1] < target) {
            start = next;
            next = next + blockSize;
            if(next > a.length) {
                next = a.length;
            }
        }
        int z = 0;
        for(int i = start; i < next; i++) {
            if (a[i] == target) {
                z = 1;
                return i;
            }
        }
        return 0;

    }
}
