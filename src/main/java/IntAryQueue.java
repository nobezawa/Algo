import java.lang.reflect.Array;

/**
 * Created by nobesawa on 15/05/05.
 */
public class IntAryQueue {
    private int max = 5;
    private int num = 0;
    private int[] que;

    public int[] enque(int add) {
        if (que == null) que = new int[max];
        que[num] = add;
        num += 1;
        return que;
    }

    public int getMax() {
        return max;
    }

}
