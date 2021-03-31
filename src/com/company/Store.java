package com.company;

public class Store {
    private String products;
    private double prices;

    public Store(String products, double prices) {
        this.products = products;
        this.prices = prices;
    }

    public Store() {
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }
}