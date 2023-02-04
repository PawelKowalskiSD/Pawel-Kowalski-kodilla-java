package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.Set;

public class OrderRequest {

    private final User user;
    private final LocalDateTime dateOfOrder;
    private final Set<Product> product;

    public OrderRequest(User user, LocalDateTime dateOfOrder, Set<Product> product) {
        this.user = user;
        this.dateOfOrder = dateOfOrder;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public Set<Product> getProduct() {
        return product;
    }
}
