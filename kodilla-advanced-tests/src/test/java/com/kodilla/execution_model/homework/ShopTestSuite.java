package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ShopTestSuite {

    Shop shoppingList = new Shop();

    Order order1 = new Order(1200, LocalDate.of(2020, 5, 5), "OlaP");
    Order order2 = new Order(240, LocalDate.of(2019, 12, 5), "Piotr");
    Order order3 = new Order(999, LocalDate.of(2020, 1, 31), "Filip");
    Order order4 = new Order(560, LocalDate.of(2020, 5, 16), "Grzegorz");


    @Test
    public void theListSizeShouldChangeAfterAddingOrder() {
        //When
        int numberOfOrders = shoppingList.returnNumberOfOrders();
        //Then
        assertEquals(4, numberOfOrders);
    }

    @Test
    public void shouldReturnOrderByIndex() {
        //When
       Order getIndex2 = shoppingList.getOrder(2);
       //Then
        assertEquals(999, getIndex2.getOrderValue(), 0.02);
        assertEquals(LocalDate.of(2020, 1, 31), getIndex2.getDate());
        assertEquals("Filip", getIndex2.getLogin());
    }

    @ParameterizedTest
    @ValueSource(ints = {-2, 55})
    public void shouldReturnNullWhenPassingANonExistentIndex (int indexNumber) {
        Order result = shoppingList.getOrder(indexNumber);
        assertNull(result);
    }

    @Test
    public void shouldReturnOrdersFromTwoDates() {
        //When
        LocalDate date1 = LocalDate.of(2020, 1, 1);
        LocalDate date2 = LocalDate.of(2020, 12, 31);

        List<Order> ordersFromTwoDates = shoppingList.returnListOfOrdersByDate(date1, date2);

        int ordersFromTwoDatesSize = ordersFromTwoDates.size();
        if (ordersFromTwoDatesSize > 0) {
            System.out.println("There are " + ordersFromTwoDatesSize + " orders that match those dates: " + ordersFromTwoDates);
        } else
            System.out.println("There are no orders on the list that match the dates you've given");

        //Then
        assertEquals(3, ordersFromTwoDatesSize);
    }

    @Test
    public void shouldReturnOrdersBasedOnOrderValues() {
        //When
        double orderValue1 = 900;
        double orderValue2 = 1300;

        List<Order> returnOrderByOrderValue = shoppingList.returnOrderByOrderValue(orderValue1, orderValue2);

        int ordersByTwoValuesSize = returnOrderByOrderValue.size();
        if (ordersByTwoValuesSize > 0) {
            System.out.println("There are " + ordersByTwoValuesSize + " orders that match those values: " + returnOrderByOrderValue);
        } else
            System.out.println("There are no orders that match those values");

        //Then
        assertEquals(2, ordersByTwoValuesSize);
    }

    @Test
    public void shouldReturnNumberOfOrders() {
        int numberOfOrders = shoppingList.returnNumberOfOrders();
        System.out.println("The number of orders is " + numberOfOrders);
        assertEquals(4, numberOfOrders);
    }

    @Test
    public void shouldSumAllOrdersValues() {
        double allOrdersValues = shoppingList.sumAllOrdersValue();
        System.out.println("The sum of all orders is: " + allOrdersValues);
        assertEquals(2999, allOrdersValues);
    }

    @BeforeEach
    public void addAllOrders() {
        shoppingList.addOrder(order1);
        shoppingList.addOrder(order2);
        shoppingList.addOrder(order3);
        shoppingList.addOrder(order4);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values");
    }

    @BeforeAll
    public static void initializeTests() {
        System.out.println("Starting tests");
    }

    @AfterAll
    public static void displayGoodbyeMessage() {
        System.out.println("Finishing testing. Goodbye");
    }
}