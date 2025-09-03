package com.example.main;

import models.People;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class ParameterizedTests {
    private static Stream<Arguments> testPeople() {
        return Stream.of(
                Arguments.of(new People("Ваня", 21, "boy")),
                Arguments.of(new People("Alisa", 23, "girl")),
                Arguments.of(new People("Danil", 16, "boy"))
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9, 4, 3})
    public void NumberMoreThenNumber(Integer number) {
        Assertions.assertTrue(number >= 3, "Меньше");
    }

    @ParameterizedTest
    @MethodSource("testPeople")
    public void testMen(People people) {
        System.out.println(people.getName() + " " + people.getAge() + " " + people.getSex());
        Assertions.assertTrue(people.getSex().contains("boy"), "Это не мальчик");
    }
}
