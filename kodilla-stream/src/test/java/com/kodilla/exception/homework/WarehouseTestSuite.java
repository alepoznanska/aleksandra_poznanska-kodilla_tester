package com.kodilla.exception.homework;

import org.junit.Test;

public class WarehouseTestSuite {

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        Order order = new Order("1");
        warehouse.addOrder(order);
        //when
        Order myOrder = warehouse.getOrder("1");
        //then

    }

    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrder_withException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        Order order = new Order("1");
        warehouse.addOrder(order);
        //when
        Order myOrder = warehouse.getOrder("67");
        //then
        
    }
}