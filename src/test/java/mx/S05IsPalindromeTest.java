package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S05IsPalindromeTest {
    @Test
    void isPalindromePlain() {
        boolean actual = S05.isPalindrome("abba");

        assertThat(actual, is(true));
    }
    
    @Test
    void isPalindromePlain2() {
        boolean actual = S05.isPalindrome("ciao");

        assertThat(actual, is(false));
    }
    
    @Test
    void isPalindromePlain3() {
        boolean actual = S05.isPalindrome("itopinonavevanonipoti");

        assertThat(actual, is(true));
    }
}
