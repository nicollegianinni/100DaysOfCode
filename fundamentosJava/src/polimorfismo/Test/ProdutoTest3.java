package polimorfismo.Test;

import polimorfismo.Computador;
import polimorfismo.Tomate;

public class ProdutoTest3 {
    public static void main(String[] args) {
        //2 objetovs criados cada um de sua classe
        Tomate tomate = new Tomate("tomate Cereja", 20);
        System.out.println(tomate);
        Computador pc = new Computador("notbook",5000);
        System.out.println(pc);

    }
}
