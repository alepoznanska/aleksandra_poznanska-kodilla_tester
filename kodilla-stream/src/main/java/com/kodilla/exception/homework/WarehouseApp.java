package com.kodilla.exception.homework;

import java.util.Scanner;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));
        warehouse.addOrder(new Order("13"));

        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of your order");
            String order = scanner.nextLine();
            try {
                Order orderNumber = warehouse.getOrder(order);
                System.out.println("Order number: " + order);
            } catch (OrderDoesntExistException e) {
                System.out.println("Wrong number");
            }
        }
    }