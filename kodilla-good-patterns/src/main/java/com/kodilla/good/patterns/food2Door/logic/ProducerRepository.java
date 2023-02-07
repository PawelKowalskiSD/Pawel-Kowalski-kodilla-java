package com.kodilla.good.patterns.food2Door.logic;

import com.kodilla.good.patterns.food2Door.logic.dataInformation.Producer;

import java.time.LocalDateTime;

public class ProducerRepository implements OrderRepository {
    @Override
    public boolean crateOrder(Producer producer, LocalDateTime dateOfOrder) {
        return true;
    }
}
