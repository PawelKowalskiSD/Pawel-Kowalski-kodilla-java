package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        Set<Product> products = new HashSet<>();
        Product product = new Product("pencil",10,2);
       Product product1 = new Product("flash drive",2,21);
       Product product2 = new Product("cup",6,17);
        products.add(product);
        products.add(product1);
        products.add(product2);

        User user = new User("Jan", "Smith", "ul. Okopowa 14, 21-300 Warsaw", "jan.smith@op.com", "-");

        LocalDateTime dateOfOrder = LocalDateTime.of(2023, 2, 2, 13 , 4, 22);

        return new OrderRequest(user, dateOfOrder, products);
    }
}
