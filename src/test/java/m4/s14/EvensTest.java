package m4.s14;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class EvensTest {

	@Test
	void evensPlain() {
		
		Exercise exe = new Exercise();
		
		List<Integer> actual = exe.evens(new int[] {1,2,3,4,5,6});
		List<Integer> expected = Arrays.asList(2,4,6);
		
		assertThat(actual,is(expected));
	}
	
	@Test
	void evensRawPlain() {
		
		Exercise exe = new Exercise();
		
		int[] actual = exe.evensRaw(new int[] {1,2,3,4,5,6});
		int[] expected = new int[] {2,4,6};
		
		assertThat(actual,is(expected));	
	}

}
