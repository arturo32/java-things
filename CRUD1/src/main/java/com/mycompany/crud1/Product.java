package com.mycompany.crud1;

/**
 *
 * @author arturo
 */
public class Product {
    private static int numberOfProducts = 0;
    private String name;
    private double price;
    
    Product(){
        numberOfProducts++;
    }
    
    
   static public void decreaseNumOfProducts(){
        numberOfProducts--;
   }
   
   static public int getNumOfProducts(){
       return numberOfProducts;
   }
    
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
