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
public class Jogador {
    private String nome;
    
    Jogador(){
        this.nome = "Zé Ninguém";
    }
    
    Jogador(String n){
        this.nome = n;
    }
    
   void setNome(String nom){
        this.nome = nom;
    }
   
   String getNome(){
       return this.nome;
   }
}
