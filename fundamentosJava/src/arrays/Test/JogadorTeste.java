package arrays.Test;
import arrays.Jogador;

//array por associação
public class JogadorTeste {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Roberto Carlos");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador jogador3 = new Jogador("Ronaldo");
        //exemplos de inicialização
        Jogador [] jogadores = new Jogador[3];
        Jogador [] jogadores2 = {jogador1,jogador2,jogador3};

        for (Jogador jogador : jogadores2){
//            System.out.println(jogador); // assim imprime espaço de memoria
            jogador.imprime();
        }
    }


}
