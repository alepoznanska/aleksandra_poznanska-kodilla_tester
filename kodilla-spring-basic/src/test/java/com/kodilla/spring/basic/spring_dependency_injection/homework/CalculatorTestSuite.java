package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldReturnProperValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Display bean = context.getBean(Display.class);
        String value = bean.display(568);
        Assertions.assertNotNull(value);
    }

    @Test
    public void shouldReturnSum() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        String sum = bean.add(4, 7);
        Assertions.assertEquals("The value is: 11.0", sum);
    }

    @Test
    public void shouldReturnDifference() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        String difference = bean.subtract(10, 3);
        Assertions.assertEquals("The value is: 7.0", difference);
    }

    @Test
    public void shouldReturnProduct() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        String product = bean.multiply(5, 5);
        Assertions.assertEquals("The value is: 25.0", product);
    }

    @Test
    public void shouldCheckIfCalculatorCanDivideByZero() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        String result = bean.divide(17, 0);
        Assertions.assertNull(result);
    }

    @Test
    public void shouldReturnQuotient() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        String quotient = bean.divide(50, 10);
        Assertions.assertEquals("The value is: 5.0", quotient);
    }
}