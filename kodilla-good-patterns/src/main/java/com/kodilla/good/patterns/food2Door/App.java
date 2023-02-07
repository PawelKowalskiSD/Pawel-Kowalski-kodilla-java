package com.kodilla.good.patterns.food2Door;

import com.kodilla.good.patterns.food2Door.logic.*;

public class App {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retriever();

        OrderProcessor orderProcessor = new OrderProcessor(new OrderInformation(), new ProducerOrderService(), new ProducerRepository());
        orderProcessor.process(orderRequest);

    }
}
