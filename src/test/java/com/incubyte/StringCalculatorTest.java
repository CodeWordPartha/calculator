package com.incubyte;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    public void testEmptyStringReturnsZero() {
        StringCalculator calc = new StringCalculator();
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            calc.add("1,-2,3");
        });
        assertEquals("negative numbers not allowed -2", ex.getMessage());
    }
}