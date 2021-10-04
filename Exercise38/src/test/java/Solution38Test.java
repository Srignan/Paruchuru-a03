/*
 *  UCF COP3330 Fall 2021 Assignment 38 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

import baseline.Solution38;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution38Test {
    @Test
    void test() {
        Solution38 test = new Solution38();
    assertEquals(2,test.filterEvenNumbers("'0','1','2'"));
}
}
