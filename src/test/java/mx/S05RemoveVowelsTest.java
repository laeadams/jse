package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S05RemoveVowelsTest {
    @Test
    void removeVowelsPlain() {
        String actual = S05.removeVowels("example");

        assertThat(actual, is("xmpl"));
    }
    
    @Test
    void removeVowelsPlain2() {
        String actual = S05.removeVowels("ciao");

        assertThat(actual, is("c"));
    }
    
    @Test
    void removeVowelsPlain3() {
        String actual = S05.removeVowels("zzzz");

        assertThat(actual, is("zzzz"));
    }
}
