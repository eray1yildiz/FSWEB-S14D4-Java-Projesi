package com.workintech.abstraction.product;

public class Chocolate extends ProductForSale{
    private String brand;

    public Chocolate(String type, double price, String description,String brand) {
        super(type, price, description);
        this.brand=brand;
    }

    public String getBrand() {
        return brand;
    }
    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Brand: " + brand + "\n");
        System.out.println(result + builder.toString());

    }
}
