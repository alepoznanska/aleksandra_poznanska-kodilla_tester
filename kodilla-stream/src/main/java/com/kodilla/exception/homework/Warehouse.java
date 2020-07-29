package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private  static List<Order> listOfOrders = new ArrayList<>();

    public void addOrder(String orderNumber) {
        Order order = new Order(orderNumber);
        listOfOrders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return listOfOrders
                .stream()
                .filter(o -> o.getNumber().equals(number))
                .findFirst().orElseThrow(OrderDoesntExistException::new);
                //.findFirst().orElseThrow(()-> new OrderDoesntExistException());
                //.findFirst().orElseThrow(()-> new Exception("this is an exception"));
    }

    public static Order getOrderNumber(Order order) {
        for(Order yourOrderNumber : listOfOrders) {
          if(yourOrderNumber.getNumber().equals(order.getNumber()))
              return yourOrderNumber;
        }
        return null;
    }
}