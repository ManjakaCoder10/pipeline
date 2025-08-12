package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testGetNumbersMessage() {
        List<String> result = Main.getNumbersMessage(5);
        assertEquals(5, result.size());
        assertEquals("i = 1", result.get(0));
        assertEquals("i = 5", result.get(4));
    }
}
