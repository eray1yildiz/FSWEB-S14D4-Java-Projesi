package com.workintech.abstraction.product;

public class Bread extends ProductForSale{
    private boolean hasSalt;
    private String flourType;
    public Bread(String type, double price, String description,boolean hasSalt,String flourType) {
        super(type, price, description);
        this.hasSalt = hasSalt;
        this.flourType = flourType;
    }

    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Salt: " + hasSalt + "\n");
        builder.append("Flour Type: " + flourType + "\n");
        System.out.println(result + builder.toString());

    }
}
