package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.assertNull;

public class WarehouseTestSuite {
    Warehouse warehouse = new Warehouse();

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        //given
        warehouse.addOrder("1");
        //when
        Order myOrder = warehouse.getOrder("1");
    }

    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrder_withException() throws OrderDoesntExistException {
        //given
        warehouse.addOrder("1");
        //when
        Order myOrder = warehouse.getOrder("165");
        //then
        assertNull(myOrder);
    }

    @Test(expected = OrderDoesntExistException.class)
    public void getOrderTest_withException() throws Exception {

        System.out.println("Test for exception in method getOrder(). \n"
                + "given - order numbers 1234, 432, 9876, 567890\n"
                + "when - ask for order that doesn't exists\n"
                + "then - throw OrderDoesntExistsException\n");
        warehouse.addOrder("1234");
        warehouse.addOrder("432");
        warehouse.addOrder("9876");
        warehouse.addOrder("567890");
        Order order = warehouse.getOrder("dasdasd");
        System.out.println("dupa blada");
        assertNull(order);
    }
}