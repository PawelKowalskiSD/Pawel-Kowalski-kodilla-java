package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.*;


public class App {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MessageService(), new ProductOrderService(), new OrderProductRepository());
        orderProcessor.process(orderRequest);
    }
}
