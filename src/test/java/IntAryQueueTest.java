import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by nobesawa on 15/05/05.
 */
public class IntAryQueueTest {

    @Test
    public void test() {
        IntAryQueue que = new IntAryQueue();
        int add = 5;
        int[] sum = {add, 0, 0, 0, 0};
        assertThat(que.enque(add), is(sum));
        int[] sum2 = {add, add, 0, 0, 0};
        assertThat(que.enque(add), is(sum2));
    }
}
