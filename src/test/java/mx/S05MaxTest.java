package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S05MaxTest {
    @Test
    void maxPlain() {
        int actual = S05.max(new int[] { 2, 3, 1 });

        assertThat(actual, is(3));
    }
    
    @Test
    void maxPlain2() {
        int actual = S05.max(new int[] { -2, -3, 0 });

        assertThat(actual, is(0));
    }
    
    @Test
    void maxPlain3() {
        int actual = S05.max(new int[] { 1, 1, 1 });

        assertThat(actual, is(1));
    }
    
    @Test
    void maxPlain4() {
        int actual = S05.max(new int[] { 45, 5, 100 });

        assertThat(actual, is(100));
    }
    
}
