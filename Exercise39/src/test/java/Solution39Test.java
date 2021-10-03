/*
 *  UCF COP3330 Fall 2021 Assignment 39 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

import baseline.Records;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {

    @Test
    void orderByLastName() {
        Records test = new Records();
        test.makeDatabase();
        String[] check = test.orderByLastName();
        assertEquals("Jackson",check[0]);
    }
}