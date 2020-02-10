package com.mycompany.crud1;
import java.util.Scanner;

/**
 *
 * @author arturo
 */
public class NewMain {
    
   
    public static void printMenu(){
        System.out.println("\n\nNow type\n"
        + "c if you want to add a new product;\n"
        + "r if you want to see all products;\n"
        + "u if you want to update a product;\n"
        + "d if you want to delete a product;\n"
        + "e if you want to exit this application.\n");
    }
    
    public static Product createProduct(){
        Scanner reader = new Scanner(System.in);
        Product newProduct = new Product();
        System.out.println("Type the name of the new product:");
        String name = reader.nextLine();
        newProduct.setName(name);
        System.out.println("Now type its price:");
        double price = reader.nextDouble();
        newProduct.setPrice(price);              
        return newProduct;
    }
    
    public static void readItAll(Product[] listOfProducts){
    System.out.println("\nName\t\tPrice");
        for(int i = 0; i < Product.getNumOfProducts(); i++){
            System.out.println(listOfProducts[i].getName() + "\t\t"+listOfProducts[i].getPrice());
        }     
    }
    
    public static void updateProduct(Product[] listOfProducts){
        boolean keep = true;
        while(keep){
            System.out.println("Tell the name of the product that you wish to change:");
            Scanner reader = new Scanner(System.in);
            String name = reader.nextLine();
            for(int i = 0; i < Product.getNumOfProducts(); i++){
                if(listOfProducts[i].getName().equals(name)){
                    System.out.println("Which property do you want to change? (type \"n\" for name and \"p\" for price)");
                    char option = reader.next().charAt(0);
                    reader.nextLine(); //To prevent the next reader from reading the space as a string;
                    switch(option){
                        case 'n': 
                            System.out.println("Type the new name of the product \""+listOfProducts[i].getName()+"\":");
                            String newname = reader.nextLine();
                            listOfProducts[i].setName(newname);
                            break;
                        case 'p':
                            System.out.println("Type the new price of the product \""+listOfProducts[i].getName()+"\":");
                            Double newprice = reader.nextDouble();
                            listOfProducts[i].setPrice(newprice);
                            break;
                    }
                    keep = false;
                }
            }
            if(keep){
                System.out.println("Sorry, product \""+name+"\" not found. Try again? (y/n)");
                if(reader.next().charAt(0) == 'n'){
                    keep = false;                    
                }
            }
        }
    }
    
    public static void deleteProduct(Product[] listOfProducts){
        boolean keep = true;
        while(keep){
            System.out.println("Tell the name of the product that you wish to delete:");
            Scanner reader = new Scanner(System.in);
            String name = reader.nextLine();
            for(int i = 0; i < Product.getNumOfProducts(); i++){
                if(listOfProducts[i].getName().equals(name)){
                    while(i < Product.getNumOfProducts()){
                        listOfProducts[i] = listOfProducts[i+1];
                        i++;
                    }
                    Product.decreaseNumOfProducts();
                    keep = false;
                    break;
                }
            }
            if(keep){
                System.out.println("Sorry, product \""+name+"\" not found. Try again? (y/n)");
                if(reader.next().charAt(0) == 'n'){
                    keep = false;                    
                }
            }
            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Tell the number of products that you wish to add:");
        int numpro = reader.nextInt();
        Product[] products = new Product[numpro];
        boolean keep = true;
        
        while(keep){
            printMenu();            
            char op = reader.next().charAt(0);
            switch(op){
                case 'c': 
                    if(Product.getNumOfProducts()<numpro){
                        products[Product.getNumOfProducts()] = createProduct();
                    }
                    else{
                        System.out.println("Sorry, limit of products reached");
                    }
                    break;
                case 'r': readItAll(products);
                    break;
                case 'u': updateProduct(products);
                    break;
                case 'd': deleteProduct(products);
                    break;
                case 'e': keep = false;
                    break;
                default: System.out.println("Sorry, \""+op+"\" is not a command.");
                    break;
            }
        }   
        
        
    }
    
}
