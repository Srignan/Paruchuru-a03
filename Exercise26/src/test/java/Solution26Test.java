/*
 *  UCF COP3330 Fall 2021 Assignment 26 Solution
 *  Copyright 2021 Srignan Paruchuru
 */
import baseline.Solution26;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution26Test {
    @Test
    void test()
    {
        double expected = 70;
        double actual = Solution26.calculateMonthsUntilPaidOff(5000,.12,100);
        double x = Math.ceil(actual);
        assertEquals(expected, x);
    }
}


