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
public class Mesa {
    Jogador jogador1;
    Jogador jogador2;
    
    Mesa(){
        this.jogador1 = new Jogador("Maria");
        this.jogador2 = new Jogador("João");
    }
    
    Mesa(Jogador j1, Jogador j2){
        this.jogador1 = j1;
        this.jogador2 = j2;
    }
    
    String getNomeJogador1(){
        return jogador1.getNome();
    }
    
    String getNomeJogador2(){
        return jogador2.getNome();
    }
    
}
