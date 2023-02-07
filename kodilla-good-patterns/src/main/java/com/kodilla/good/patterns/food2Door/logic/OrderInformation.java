package com.kodilla.good.patterns.food2Door.logic;

import com.kodilla.good.patterns.food2Door.logic.dataInformation.Producer;

public class OrderInformation implements InformationService{
    @Override
    public void producerInformation(Producer producer) {
        System.out.println(" Welcome in " + producer.getProducerName() + "\n We got your order and we are starting to process it.\n"
        + "This is the list of ordered products: " + producer.getProduct().toString().replace("[", "").replace("]", ""));
    }
}
