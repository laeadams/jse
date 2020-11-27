package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S05AverageTest {
    @Test
    void averagePlain() {
        double actual = S05.average(new int[] { 1, 2, 3 });

        assertThat(actual, is(2.0));
    }
    
    @Test
    void averagePlain2() {
        double actual = S05.average(new int[] { -1, 0, 1 });

        assertThat(actual, is(0.0));
    }
}
