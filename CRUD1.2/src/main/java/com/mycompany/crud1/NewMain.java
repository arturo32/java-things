package com.mycompany.crud1;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author arturo
 */
public class NewMain {
    
   
    public static void printMenu(){
        System.out.println("\n\nType\n"
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
        boolean keep = true;
        while(keep){
            try{
                System.out.println("Now type its price:");
                double price = reader.nextDouble();
                keep = false;
                newProduct.setPrice(price);  
            }catch(InputMismatchException e){
                System.out.println("Incorrect input. Try again.");
                reader.next();
            }          
        }
        return newProduct;
    }
    
    public static void readItAll(LinkedList<Product>  listOfProducts){
    System.out.println("\nName\t\tPrice");
        for(int i = 0; i < listOfProducts.size(); i++){
            System.out.println(listOfProducts.get(i).getName() + "\t\t"+listOfProducts.get(i).getPrice());
        }     
    }
    
    public static void updateProduct(LinkedList<Product>  listOfProducts){
        boolean keep = true;
        while(keep){
            System.out.println("Tell the name of the product that you wish to change:");
            Scanner reader = new Scanner(System.in);
            String name = reader.nextLine();
            for(int i = 0; i < listOfProducts.size(); i++){
                if(listOfProducts.get(i).getName().equals(name)){
                    System.out.println("Which property do you want to change? (type \"n\" for name and \"p\" for price)");
                    char option = reader.next().charAt(0);
                    reader.nextLine(); //To prevent the next reader from reading the space as a string;
                    switch(option){
                        case 'n': 
                            System.out.println("Type the new name of the product \""+listOfProducts.get(i).getName()+"\":");
                            String newname = reader.nextLine();
                            listOfProducts.get(i).setName(newname);
                            break;
                        case 'p':
                            boolean keep2 = true;
                            while(keep2){
                                try{
                                    System.out.println("Type the new price of the product \""+listOfProducts.get(i).getName()+"\":");
                                    double newprice = reader.nextDouble();
                                    keep2 = false;
                                    listOfProducts.get(i).setPrice(newprice); 
                                }catch(InputMismatchException e){
                                    System.out.println("Incorrect input. Try again.");
                                    reader.next();  
                                }
                            }
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
    
    public static void deleteProduct(LinkedList<Product> listOfProducts){
        boolean keep = true;
        while(keep){
            System.out.println("Tell the name of the product that you wish to delete:");
            Scanner reader = new Scanner(System.in);
            String name = reader.nextLine();
            for(int i = 0; i < listOfProducts.size(); i++){
                if(listOfProducts.get(i).getName().equals(name)){
                    listOfProducts.remove(i);
                    System.out.println("\""+name+"\" deleted successfully!");
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
        LinkedList<Product> products = new LinkedList<>();
        boolean keep = true;
        
        while(keep){
            printMenu();            
            char op = reader.next().charAt(0);
            switch(op){
                case 'c': products.add(createProduct());
                    break;
                case 'r': readItAll(products);
                    break;
                case 'u': updateProduct(products);
                    break;
                case 'd': deleteProduct(products);
                    break;
                case 'e': keep = false; System.out.println("Goodbye!");
                    break;
                default: System.out.println("Sorry, \""+op+"\" is not a command.");
                    break;
            }
        }   
        
        
    }
    
}
