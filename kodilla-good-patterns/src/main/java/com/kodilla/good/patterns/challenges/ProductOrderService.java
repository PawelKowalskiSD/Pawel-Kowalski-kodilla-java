package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.Set;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order (final  User user, final LocalDateTime dateOfOrder, final Set<Product> product) {
        System.out.println("======================New Order===========================");
        System.out.println("New order: " + user.getName() + " " + user.getSurname() + "\n"
                    + "Date order: " + dateOfOrder.toString() + "\n"
                    + "Shipping address: " + user.getShippingAddress() + "\n"
                    + "Email: " + user.getEmailAddress() + "\n"
                    + "Phone number: " + user.getPhoneNumber() + "\n"
                    + product.toString().replace("[","").replace("]", "").replace(", ", ""));
        return true;
    }
}
