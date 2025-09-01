package com.example.main;

import org.junit.jupiter.api.*;

public class LifeCycleTests {

    @BeforeAll
    public static void sey() {
        System.out.println("Ла-ла-ла-Ле-Ло");
    }

    @BeforeEach
    public void seyEo() {
        System.out.println("Ее-Оо");
    }

    @Test
    public void testWhichNumberIsGrerater() {
        int a = 4;
        int b = 5;
        Assertions.assertTrue(a < b, "Не правильно, a должно быть больше b");
    }

    @Test
    public void testNumberEqualsNumber() {
        int a = 4;
        int b = 4;
        Assertions.assertEquals(a, b, "Не равно");
    }

    @Test
    public void testEvenNumber() {
        int a = 7;
        Assertions.assertFalse(a % 2 == 0);
    }

    @AfterEach
    public void seySanta() {
        System.out.println("Ho-ho-hocheh est?");
    }

    @AfterAll
    public static void seyFredy() {
        System.out.println("Le-la-la-le-lo-lo-EEeeop");
    }


}
