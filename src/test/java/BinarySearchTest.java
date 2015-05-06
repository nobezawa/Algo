import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;


/**
 * Created by nobesawa on 15/05/04.
 */
public class BinarySearchTest {

    @Test
    public void binarySearch() {
        BinarySearch bin = new BinarySearch();
        int[] x = {1,2,3,4,5,6};
        int length = 6;
        assertThat(BinarySearch.binarySearch(x, 6), is(5));
    }
}
