package coleçoes.List.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// SORTING ORDENAR
//CLASSE UTILITARIA COLLECTIONS:
public class ListSorting01 {
    public static void main(String[] args) {
        List<String> filmes = new ArrayList<>(6);
        filmes.add("1");
        filmes.add("0"); // NUMEROS PRIMEIRO, começando do zero
        filmes.add("01"); // SEGUE A ORDEM NUMERICA
        filmes.add("a vida é bela");
        filmes.add("Velozes e furiosos");
        filmes.add("Pocahontas");
        filmes.add("O menino do pijama listrado");


        //mostrar a lista no arrey ele mantem usando a base do index (ordem de inserção)
        System.out.println("List:");
        for (String filme : filmes) {
            System.out.println(filme);
        }

        System.out.println();
        //Usando COLLETIONS
        // ordenar por ordem alfabetica e alfanumerico
        // OBSERVAÇÃO: Letras maisculas
        // se a letra tiver em minusculo ela vai automaticamente p fim da fila, seguindo a ordem alfabetica
        System.out.println("List com Colletions.sort:");
        Collections.sort(filmes);
        for (String filme : filmes) {
            System.out.println(filme);
        }

        System.out.println();
        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(100D); // coloca o D no final p sinalizar que é double, não um int
        dinheiros.add(23D);

        System.out.println();

        for (Double dinheiro : dinheiros) {
            System.out.println(dinheiro);
        }

        System.out.println("List sem Colletions sort");
        System.out.println(dinheiros);

        System.out.println();
        System.out.println("List com Colletions.sort");
        Collections.sort(dinheiros);

        //teste da classe FilmeSort > contrutor > Objects.requireNonNull(id);
        new FilmesSort(null,null,0);

    }

}
