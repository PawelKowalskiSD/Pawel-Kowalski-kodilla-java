package com.kodilla.patterns2.facade;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;

@Service
public class ProducerService {
    public BigDecimal getPrice(Long productID) {
        Random generator = new Random();
        return  new BigDecimal(generator.nextInt(100_000) / 100);
    }
}
