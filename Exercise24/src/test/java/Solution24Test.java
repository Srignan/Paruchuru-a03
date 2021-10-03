/*
 *  UCF COP3330 Fall 2021 Assignment 24 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

import baseline.Solution24;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution24Test {

    @Test
    void isAnagram() {
        var app = new Solution24();
        boolean actualT1 = Solution24.isAnagram("note", "tone");
        assertTrue(actualT1);
        boolean actualT2 = Solution24.isAnagram("note", "tome");
        assertFalse(actualT2);
    }
}

