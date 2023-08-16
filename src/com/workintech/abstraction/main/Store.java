package com.workintech.abstraction.main;
import com.workintech.abstraction.product.Bread;
import com.workintech.abstraction.product.Chocolate;
import com.workintech.abstraction.product.Coke;
import com.workintech.abstraction.product.ProductForSale;
public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("chocolate", 22.5, "sütlü çikolata", "milka");
        products[1] = new Coke("coke", 18.5, "description", 2.5, true);
        products[2] = new Bread("bread", 10, "description", false, "wheat");
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        if (products != null){
            for (ProductForSale product : products){
                if (product != null) {
                    product.showDetails();
                    System.out.println("Sales Price: " +product.getSalesPrice(3));
                    System.out.println("---other product----");
                }
            }
        }

    }
}