import java.util.Scanner;


/**
 * 線形探索(番兵法)
 */
public class SeqSearchSen {

    static int seqSearch(int[] a, int n, int key) {
        int i = 0;
        a[n] = key;
        while (true) {
            if (a[i] == key) {
                break;
            }
            i++;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("要素数: ");
        int num = stdIn.nextInt();
        int[] x = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("探す値: ");
        int ky = stdIn.nextInt();

        int idx = seqSearch(x, num, ky);
        if (idx == -1) {
            System.out.println("その値は要素に存在しない");
        }else{
            System.out.println("その値はx[" + idx + "]にあります");
        }
    }
}
