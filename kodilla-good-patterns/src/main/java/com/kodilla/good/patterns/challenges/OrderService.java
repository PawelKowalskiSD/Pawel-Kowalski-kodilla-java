package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.Set;

public interface OrderService {

    boolean order (User user, LocalDateTime dateOfOrder, Set<Product> product);
}
