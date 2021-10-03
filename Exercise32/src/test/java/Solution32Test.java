/*
 *  UCF COP3330 Fall 2021 Assignment 32 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

import baseline.GuessingGame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Solution32Test {

    @Test
    void test() {
        GuessingGame test = new GuessingGame();
        assertEquals(2,test.check("2"));
    }

    @Test
    void test2() {
        GuessingGame test = new GuessingGame();
        assertEquals(-1,test.check("red"));
    }
}
