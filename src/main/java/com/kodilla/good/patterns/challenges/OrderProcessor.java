package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderProcessor implements OrderService {

    @Override
    public boolean order(User user, Order order, LocalDateTime orderDate) {
        return true;
    }
}