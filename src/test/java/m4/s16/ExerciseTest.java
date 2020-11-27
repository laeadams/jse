package m4.s16;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
//import static org.junit.jupiter.api.Assertions.assertThrows;

//import java.util.Arrays;
//import java.util.List;

import static org.hamcrest.Matchers.arrayContainingInAnyOrder;

import org.junit.jupiter.api.Test;

class ExerciseTest {

	@Test
	void singlesPlain() {
		Exercise ex = new Exercise();
		
		Integer[] actual = ex.singles(new int[] {12,53,12,35});
		Integer[] expected = {12,53,35};
		
		assertThat(actual.length, is(expected.length));
		assertThat(expected, arrayContainingInAnyOrder(actual));
	}

}
