package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S04FibonacciTest {
    @Test
    void fibonacciPlain() {
    	
    	long actual = S04.fibonacci(6);
    	
        assertThat(actual, is(8L));
    }
    
    void fibonacciPlain2() {
    	
    	long actual = S04.fibonacci(10);
    	
        assertThat(actual, is(34L));
    }
}
