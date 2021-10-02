package Solution25Test;

import baseline.strengthofpass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void passwordValidator1() {
        String expected = "Very Strong";
        String actual = strengthofpass.passwordValidator("1337h@xor!");

        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator2() {
        String expected = "Strong";
        String actual = strengthofpass.passwordValidator("abc123xyz");

        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator3() {
        String expected = "Weak";
        String actual = strengthofpass.passwordValidator("abcdef");

        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator4() {
        String expected = "Very Weak";
        String actual = strengthofpass.passwordValidator("12345");

        assertEquals(expected, actual);
    }
}

