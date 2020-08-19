package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class WeightAndHeightSources {

    static Stream<Arguments> provideWeightAndHeightForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(1.55, 35), "Very severely underweight"),
                Arguments.of(new Person(1.77, 50), "Severely underweight"),
                Arguments.of(new Person(2.01, 70), "Underweight"),
                Arguments.of(new Person(1.44, 50), "Normal (healthy weight)"),
                Arguments.of(new Person(1.80, 87), "Overweight"),
                Arguments.of(new Person(1.65, 88), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.65, 100), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.70, 120), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.99, 190), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.44, 110), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.80, 197), "Obese Class VI (Hyper Obese)")
        );
    }
}
