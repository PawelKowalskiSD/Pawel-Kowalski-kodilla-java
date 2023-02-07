package com.kodilla.good.patterns.food2Door.logic;

public class OrderProcessor {

    private final InformationService informationService;

    private final OrderService orderService;

    private final OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrder = orderService.order(orderRequest.getProducer(), orderRequest.getDateOfOrder());

        if (isOrder) {
            informationService.producerInformation(orderRequest.getProducer());
            orderRepository.crateOrder(orderRequest.getProducer(), orderRequest.getDateOfOrder());
            return new OrderDto(orderRequest.getProducer(), true);
        } else {
            return new OrderDto((orderRequest.getProducer()), false);
        }
    }
}
