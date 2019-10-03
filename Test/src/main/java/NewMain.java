/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arturo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arquivo Arturo = new Arquivo();
        Arturo.name = "Notas";
        Arturo.num = 42;
        Arturo.code = 'A';
        Arturo.price = (float) 2.5;
        System.out.println(Arturo.name+"\n"+
                Arturo.num+"\n"+
                Arturo.code+"\n"+
                Arturo.price+"\n");
    }
    
}
