package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.Set;

public interface OrderRepository {

    boolean createOrder(User user, LocalDateTime dateOfOrder, Set<Product> product);
}
