package com.mycompany.crud1;

/**
 *
 * @author arturo
 */
public class Product {
    private String name;
    private double price;
    
    public double getPrice(){
        return this.price;
    }
    
    public void setPrice(double p){
        this.price = p;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String n){
        this.name = n;
    }
}
