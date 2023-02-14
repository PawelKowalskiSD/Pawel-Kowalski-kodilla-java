package com.kodilla.good.patterns.food2Door.logic;

import com.kodilla.good.patterns.food2Door.logic.dataInformation.Producer;

import java.time.LocalDateTime;

public class ProducerRepository implements OrderRepository {
    @Override
    public boolean crateOrder(Producer producer, LocalDateTime dateOfOrder) {
        System.out.println("\n===========================CreateOrder==============================");
        System.out.println("Producer: " + producer.getProducerName() + "\n" + "Date of order: " + dateOfOrder
                + "\n" + "Product: " + producer.getProduct().toString().replace("[", "").replace("]", ""));
        return true;
    }
}
