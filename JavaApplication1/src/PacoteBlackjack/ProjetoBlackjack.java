/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteBlackjack;

/**
 *
 * @author aluno
 */
public class ProjetoBlackjack {
    
   
     public static void main(String[] args) {
         Jogador a1 = new Jogador();
         Carta c1 = new Carta();
         
        System.out.println("A carta é "+ c1.getNumero() + " de " + c1.getNaipe() + " e o jogador é "+ a1.getNome()+".\n");
         
         Jogador a2 = new Jogador("Arturo");
         Carta c2 = new Carta('8', "Paus", 8);
         
         System.out.println("A carta é "+ c2.getNumero() + " de " + c2.getNaipe() + " e o jogador é "+ a2.getNome()+".\n");
         
         Mesa m1 = new Mesa();
         System.out.println("Jogador1: "+ m1.getNomeJogador1());
         System.out.println("Jogador2 " + m1.getNomeJogador2()+"\n");
         
         Mesa m2 = new Mesa(a1, a2);
         System.out.println("Jogador1: "+ m2.getNomeJogador1());
         System.out.println("Jogador2: " + m2.getNomeJogador2()+"\n");
     }
    
}
