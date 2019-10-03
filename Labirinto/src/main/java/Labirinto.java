
public class Labirinto {
    private static final char TAMANHO = 10;
    private static final char VAZIO = ' ';
    private static final char PAREDE_VERTICAL = '|';
    private static final char PAREDE_HORIZONTAL = '-';
    private static final char PAREDE_INTERNA = '@';
    private static char[][] tabuleiro;
    private static final double PROBABILIDADE = 0.7;
            
    public static void inicializarTabuleiro(){
        tabuleiro = new char[TAMANHO][TAMANHO];
        
        for(int i = 0; i < TAMANHO; i++){
            for(int j = 0; j < TAMANHO; j++){
                if(i == 0 || i == TAMANHO-1 && j != 0){
                    tabuleiro[i][j] = PAREDE_HORIZONTAL;
                }
                else if(j == 0 || j == TAMANHO-1){
                    tabuleiro[i][j] = PAREDE_VERTICAL;
                }
                else{
                    if(Math.random() > PROBABILIDADE){
                        tabuleiro[i][j] = PAREDE_INTERNA;
                    }
                    else{
                        tabuleiro[i][j] = VAZIO;
                    }
                }
            }
        }
    }
    
    public static void imprimirTabuleiro(){
        for(int i = 0; i < TAMANHO; i++){
            for(int j = 0; j < TAMANHO; j++){
                System.out.print(tabuleiro[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        
        inicializarTabuleiro();
        imprimirTabuleiro();
    }
    
}


