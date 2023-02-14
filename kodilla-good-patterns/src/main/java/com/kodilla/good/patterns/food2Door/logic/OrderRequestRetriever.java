package com.kodilla.good.patterns.food2Door.logic;

import com.kodilla.good.patterns.food2Door.logic.dataInformation.Producer;
import com.kodilla.good.patterns.food2Door.logic.dataInformation.Product;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class OrderRequestRetriever {

    public OrderRequest retriever() {
        Set<Product> extraFoodShopProductList = new HashSet<>();
                    extraFoodShopProductList.add(new Product("tea", 2));
        LocalDateTime dateOfOrder = LocalDateTime.of(2023, 1, 12, 13, 44, 22);
        Producer extraFoodShop = new Producer("ExtraFoodShop", extraFoodShopProductList);


        return new OrderRequest(extraFoodShop, dateOfOrder);
    }
}
