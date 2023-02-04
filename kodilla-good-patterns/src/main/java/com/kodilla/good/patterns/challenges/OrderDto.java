package com.kodilla.good.patterns.challenges;

public class OrderDto {

    private final User user;
    private final boolean isOrder;

    public OrderDto(final User user, final boolean isOrder) {
        this.user = user;
        this.isOrder = isOrder;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
