package coleçoes.List.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FilmeSort01 {
    public static void main(String[] args) {

        List<FilmesSort> filmes = new ArrayList<>(6);

        filmes.add(new FilmesSort(1L,"a vida é bela", 10));
        filmes.add(new FilmesSort(5L,"Velozes e furiosos", 10));
        filmes.add(new FilmesSort(3L,"Pocahontas", 10));
        filmes.add(new FilmesSort(2L,"O menino do pijama listrado", 10));

        System.out.println(filmes); // mostra no to string
        System.out.println();

        System.out.println("Lista de filmes:"); // mostra a lista por FOR
        for (FilmesSort filme : filmes) {
            System.out.println(filme);
        }
        System.out.println();
        Collections.sort(filmes);
        System.out.println("Lista de filmes com Comparable, Colletions sort ordenando:"); // mostra a lista por FOR
        for (FilmesSort filme : filmes) {
            System.out.println(filme);
        }


    }

}
