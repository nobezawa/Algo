import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by nobesawa on 15/05/04.
 */
public class SampleTest {
    @Test
    public void test() {
        Sample sample = new Sample();
        assertThat(sample.getMessage(), is("Sample!"));
    }
}
