package com.kodilla.good.patterns.food2Door.logic;

import com.kodilla.good.patterns.food2Door.logic.dataInformation.Producer;

import java.time.LocalDateTime;

public class ProducerOrderService implements OrderService {
    @Override
    public boolean order(Producer producer, LocalDateTime dateOfOrder) {
        System.out.println("\n==============================Order=================================");
        System.out.println("Processed order on: " + dateOfOrder + " from: " + producer.getProducerName()
        + "\n" + "Order products: " + producer.getProduct().toString().replace("[", "").replace("]", "")
        + "\nin Progress..... ");
        return true;
    }
}
