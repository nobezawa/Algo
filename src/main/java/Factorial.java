import java.util.Scanner;

/**
 * Created by nobesawa on 15/05/06.
 */
public class Factorial {

    static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数を入力せよ　：");
        int x = stdIn.nextInt();

        System.out.println(x + "の階上は" + factorial(x) + "です");
    }
}
