package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class Product {

    private final String productName;
    private final int quantity;
    private final int price;

    public Product(String productName, int quantity, int price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public double calculateProduct() {
        return calculateOnePosition();
    }

    private double calculateOnePosition() {
       double totalPrice = 0;
        for (int i = 0; i < getQuantity(); i++)
            totalPrice += getPrice();
        return totalPrice;
    }


    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  getProductName()
                + " -->> Quantity: " + getQuantity() + "pcs"
                + " -->> Price per item: " + getPrice() + " zł -->> "
                + "Total: = " + calculateProduct() + " zł" + "\n";


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (quantity != product.quantity) return false;
        if (price != product.price) return false;
        return Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        int result = productName != null ? productName.hashCode() : 0;
        result = 31 * result + quantity;
        result = 31 * result + price;
        return result;
    }
}
