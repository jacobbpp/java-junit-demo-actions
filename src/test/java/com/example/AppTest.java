package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testAddition() {
        assertEquals(5, App.add(2, 3), "2 + 3 should equal 5");
    }
}
