package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private final User user;
    private final Order order;
    private final LocalDateTime orderDate;

    public OrderRequest(final User user, final Order order, final LocalDateTime orderDate) {
        this.user = user;
        this.order = order;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public Order getOrder() {
        return order;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}