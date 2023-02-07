package com.kodilla.good.patterns.food2Door.logic;

import com.kodilla.good.patterns.food2Door.logic.dataInformation.Producer;

public class OrderDto {

    private final Producer producer;
    private final boolean isOrder;

    public OrderDto(final Producer producer, final boolean isOrder) {
        this.producer = producer;
        this.isOrder = isOrder;
    }

    public Producer getProducer() {
        return producer;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
