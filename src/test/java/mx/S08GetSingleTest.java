package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class S08GetSingleTest {
	
    @Test
    void binarySumTestPlain1() {
    	
    	int[] test = {1,2,3,2,1};
        int actual = S08.getSingle(test);

        assertThat(actual, is(3));
    }
	
	

}
