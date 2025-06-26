package arrays.Test;

import arrays.Jogador;
import arrays.Time;

public class TimeTest {
    public static void main(String[] args) {

        Jogador jogador01 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

       // inserção do jogador no time - associando as classes
        jogador01.setTime(time);

        jogador01.imprime();
    }
}
