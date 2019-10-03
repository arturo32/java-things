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
public class Carta {
    private char numero;
    private String naipe;
    private int valor;
    
    Carta(){
        this.numero = '0';
        this.naipe = "fake";
        this.valor = 0;
    }
    
    Carta(char num, String n, int v){
        this.numero = num;
        this.naipe = n;
        this.valor = v;
    }
    
    void setNumero(char num){
        this.numero = num;
    }
    char getNumero(){
        return this.numero;
    }
    
    void setNaipe(String num){
        this.naipe = num;
    }
    String getNaipe(){
        return this.naipe;
    }
    
    void setValor(int num){
        this.valor = num;
    }
    int getValor(){
        return this.valor;
    }
    
    
    
    
    
    
}
