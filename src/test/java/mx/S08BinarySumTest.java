package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class S08BinarySumTest {

	@Test
	void binarySumTestPlain1() {
		String actual = S08.binarySum("10", "11");

		assertThat(actual, is("101"));
	}

	@Test
	void binarySumTestPlain2() {
		String actual = S08.binarySum("1", "1");

		assertThat(actual, is("10"));
	}

	@Test
	void binarySumTestPlain3() {
		String actual = S08.binarySum("101", "111");

		assertThat(actual, is("1100"));
	}

	@Test
	void bunarySumTestException() {
		try {
			S08.binarySum("10","101");
			fail("An IllegalArgumentException was expected");
		} catch (IllegalArgumentException eue) {
			String message = eue.getMessage();
			assertThat(message, is("Strings have different size"));
		}
	}

}
