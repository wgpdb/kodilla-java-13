package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("jsmith", "John", "Smith", "john@smith.com",
                "abc Street");

        Order order = new Order("Tooth brush", 2258, 29.99);

        LocalDateTime orderDate = LocalDateTime.now();

        return new OrderRequest(user, order, orderDate);
    }
}