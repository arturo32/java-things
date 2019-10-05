package PacoteBlackJack;

public class ProjetoBlackjack{
    public static void main(String args[]){
        Carta cartaD = new Carta();
        System.out.println("Número: " + cartaD.getNumero());
        System.out.println("Naipe: " + cartaD.getNaipe());
        System.out.println("Valor: " + cartaD.getValor());
        
        Jogador jogadorD = new Jogador();
        System.out.println("Nome: " + jogadorD.getNome());
        
        System.out.println("");
        
        Jogador jogadorE = new Jogador("Rita");
        
        Carta cartaE = new Carta("8", "Paus", 8) ;
        
        System.out.println("A carta é " + cartaE.getNumero() + " de " + cartaE.getNaipe() + " e o jogador é " + jogadorE.getNome());
        
        System.out.println("");
        
        Mesa mesaD = new Mesa();
        System.out.println("Jogadores: " + mesaD.getJogador1() + " e " + mesaD.getJogador2());
        
        Mesa mesaE = new Mesa("Martha", "Rosa");
        
        System.out.println("Jogadores: " + mesaE.getJogador1() + " e " + mesaE.getJogador2());
    }
}
