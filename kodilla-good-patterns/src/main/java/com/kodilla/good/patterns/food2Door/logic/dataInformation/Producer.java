package com.kodilla.good.patterns.food2Door.logic.dataInformation;

import java.util.Set;

public class Producer {
    private final String producerName;
    private final Set<Product> product;

    public Producer(String producerName, Set<Product> product) {
        this.producerName = producerName;
        this.product = product;
    }

    public String getProducerName() {
        return producerName;
    }

    public Set<Product> getProduct() {
        return product;
    }
}
