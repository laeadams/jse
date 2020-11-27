package m4.s14;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class SinglesTest {

	@Test
	void singlePlain() {
		
		Exercise exe = new Exercise();
		
		List<Integer> actual = exe.singles(new int[] {1,1,2,2,3,4,4,5,6,6});
		List<Integer> expected = Arrays.asList(3,5);
		
		assertThat(actual,is(expected));
	}
	
	@Test
	void singlePlain2() {
		
		Exercise exe = new Exercise();
		
		List<Integer> actual = exe.singles(new int[] {1,1,1,3,4,4,6,6});
		List<Integer> expected = Arrays.asList(3);
		
		assertThat(actual,is(expected));
	}
	
	@Test
	void singlePlain3() {
		
		Exercise exe = new Exercise();
		
		List<Integer> actual = exe.singles(new int[] {1,1,1,3,4,4,6,6});
		List<Integer> expected = Arrays.asList(3);
		
		assertThat(actual,is(expected));
	}
	
	@Test
	void singleLogPlain() {
		
		Exercise exe = new Exercise();
		
		List<Integer> actual = exe.singlesLog(new int[] {1,1,2,2,3,4,4,5,6,6});
		List<Integer> expected = Arrays.asList(3,5);
		
		assertThat(actual,is(expected));
	}
	@Test
	void singleLogPlain2() {
		
		Exercise exe = new Exercise();
		
		List<Integer> actual = exe.singlesLog(new int[] {1,2,5,7,7,2,1,5});
		List<Integer> expected = Arrays.asList();
		
		assertThat(actual,is(expected));
	}

}
