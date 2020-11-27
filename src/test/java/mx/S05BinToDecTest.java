package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S05BinToDecTest {
    @Test
    void bin2decPlain() {
        int actual = S05.bin2dec("1001");

        assertThat(actual, is(9));
    }
    
    @Test
    void bin2decPlain2() {
        int actual = S05.bin2dec("111000");

        assertThat(actual, is(56));
    }
    
    @Test
    void bin2decPlain3() {
        int actual = S05.bin2dec("0");

        assertThat(actual, is(0));
    }
    
    @Test
    void bin2decPlain4() {
        int actual = S05.bin2dec("1100100");

        assertThat(actual, is(100));
    }
}
