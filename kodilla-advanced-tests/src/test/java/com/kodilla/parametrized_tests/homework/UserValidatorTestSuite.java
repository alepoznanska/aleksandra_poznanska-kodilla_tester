package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {

    UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"123", "abc", "ABC", "1aB", "_-.", "a.B_3-"})
    public void username_shouldReturnTrueIfStringHasAllowedCharacters(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @EmptySource
    @ValueSource(strings = {" ", "ab", "a b", "#", ","})
    public void username_shouldReturnFalseIfNotEnoughCharactersOrNotAllowed(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ola.poznanska@gmail.com", "ola.poznanska@gmail.com.pl"})
    public void email_shouldReturnTrueIfStringMatchesRegex(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {" ", "#", ",", "olapoznanska@gmail", "ola.poznanska@gmail", "ola.poznanska@gmail.", "ola.poznanska@gmail.comcomcom"})
    public void email_shouldReturnFalseIfNotEnoughCharactersOrNotAllowed(String email) {
        assertFalse(validator.validateEmail(email));
    }
}