package com.kodilla.good.patterns.food2Door.logic;

import com.kodilla.good.patterns.food2Door.logic.dataInformation.Producer;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean crateOrder(Producer producer, LocalDateTime dateOfOrder);
}
