package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class CompletedOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, Order order, LocalDateTime orderDate) {

        System.out.println("User: " + user.getUserName() + "\n" +
                "Order: " + order.getProductName() + " / " + order.getProductStockNumber() + "\n" +
                "Price: " + order.getProductPrice() + "\n" +
                "Date: " + orderDate);

        return true;
    }
}