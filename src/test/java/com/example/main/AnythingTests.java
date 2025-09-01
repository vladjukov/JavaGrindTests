package com.example.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnythingTests {
    @Test
    public void testWhichNumberLess() {
        int a = 8;
        int b = 7;
        Assertions.assertTrue(a > b, "Не правильно, b должно быть больше a");
    }
}
