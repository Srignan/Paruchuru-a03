/*
 *  UCF COP3330 Fall 2021 Assignment 25 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Solution25Test;

import baseline.strengthofpass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void passwordValidator1() {
        String expected = "This password is very strong.";
        String actual = strengthofpass.passwordValidator("1337h@xor!");

        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator2() {
        String expected = "This password is strong.";
        String actual = strengthofpass.passwordValidator("abc123xyz");

        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator3() {
        String expected = "This password is weak.";
        String actual = strengthofpass.passwordValidator("abcdef");

        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator4() {
        String expected = "This password is very weak.";
        String actual = strengthofpass.passwordValidator("12345");

        assertEquals(expected, actual);
    }
}

