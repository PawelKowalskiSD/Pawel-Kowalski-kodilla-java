package com.kodilla.good.patterns.food2Door.logic;

import com.kodilla.good.patterns.food2Door.logic.dataInformation.Producer;

import java.time.LocalDateTime;

public class OrderRequest {
    private final Producer producer;
    private final LocalDateTime DateOfOrder;

    public OrderRequest(final Producer producer, final LocalDateTime dateOfOrder) {
        this.producer = producer;
        DateOfOrder = dateOfOrder;
    }

    public Producer getProducer() {
        return producer;
    }

    public LocalDateTime getDateOfOrder() {
        return DateOfOrder;
    }
}
