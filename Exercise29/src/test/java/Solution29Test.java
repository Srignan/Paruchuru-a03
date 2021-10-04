/*
 *  UCF COP3330 Fall 2021 Assignment 29 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

import baseline.solution29;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Solution29Test {

    @Test
    void test() {
      boolean actualT1 = solution29.RateOfReturn("note", "tone");
      assertTrue(actualT1);
      boolean actualT2 = solution29.RateOfReturn("note", "tome");
      assertFalse(actualT2);
    }
}