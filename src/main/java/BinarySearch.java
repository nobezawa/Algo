import java.util.Scanner;

/**
 * Created by nobesawa on 15/05/04.
 */
public class BinarySearch {

    static int binarySearch(int[] a, int key) {
        int p1 = 0;
        int pr = a.length - 1;

        while (p1 <= pr) {
            int pc = (p1 + pr) / 2;
            if (a[pc] == key) return pc;
            if (a[pc] < key) p1 = pc + 1;
            if (! (a[pc] < key)) pr = pc -1;
        }

        return -1;
    }

}
