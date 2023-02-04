package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.Set;

public class OrderProductRepository  implements OrderRepository {

    @Override
    public boolean createOrder(User user, LocalDateTime dateOfOrder, Set<Product> product) {
        System.out.println("======================Create Order===========================");
        System.out.println("Create new order: " + user.getName() + " " + user.getSurname() + "\n"
                + "Date order: " + dateOfOrder.toString() + "\n"
                + "Shipping address: " + user.getShippingAddress() + "\n"
                + "Email: " + user.getEmailAddress() + "\n"
                + "Phone number: " + user.getPhoneNumber() + "\n"
                + product.toString().replace("[","").replace("]", "").replace(", ", ""));
        return true;
    }
}
