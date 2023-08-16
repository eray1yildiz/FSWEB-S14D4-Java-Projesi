package com.workintech.abstraction.product;

public class Coke extends ProductForSale{
    private double liter;
    private boolean hasSugar;

    public Coke(String type, double price, String description,double liter,boolean hasSugar) {
        super(type, price, description);
        this.liter =liter;
        this.hasSugar=hasSugar;
    }

    public double getLiter() {
        return liter;
    }

    public boolean isHasSugar() {
        return hasSugar;
    }
    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Liter: " + liter + "\n");
        builder.append("Sugar: " + hasSugar + "\n");
        System.out.println(result + builder.toString());

    }


}
