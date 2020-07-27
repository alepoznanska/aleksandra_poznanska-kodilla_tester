package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {
    private  static List<Order> listOfOrders = new ArrayList<>();

    public void addOrder(Order order) {
        listOfOrders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        List<Order> orders = listOfOrders
                .stream()
                .filter(o -> o.getNumber().equals(number))
                .map(Warehouse::getOrderNumber)
                .collect(Collectors.toList());

        if (orders.isEmpty())
            throw new OrderDoesntExistException();
        else
            return getOrderNumber(new Order(number));
    }

    public static Order getOrderNumber(Order order) {
        for(Order yourOrderNumber : listOfOrders) {
          if(yourOrderNumber.getNumber().equals(order.getNumber()))
              return yourOrderNumber;
        }
        return null;
    }
}