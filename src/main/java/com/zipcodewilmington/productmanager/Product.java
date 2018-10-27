package com.zipcodewilmington.productmanager;

/**
 * Created by leon on 1/10/18.
 */
public class Product {

    private double price;
    private int quantity;
    private double id;

    public Product(double productType, int quantityOfItems, double priceOfItem) {
        price = priceOfItem;
        quantity = quantityOfItems;
        id = productType;

    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price=price;

    }

    public int getQuantity() {
        return this.quantity;
    }


    public void setQuantity(int quantity) {
        this.quantity=quantity;

    }

    public double getId() {
        return id;
    }
}
