package com.kodilla.good.patterns.food2Door.logic.dataInformation;

public class Product {
    private final String ProductName;
    private  final int quantity;

    public Product(String productName, int quantity) {
        ProductName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return ProductName;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product--> " + ProductName +
                "--> quantity--> " + quantity + "pcs";
    }
}
