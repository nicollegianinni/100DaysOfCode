package polimorfismoExercicio.Test;

import polimorfismoExercicio.Usuario;
import polimorfismoExercicio.Video;

public class VideoTest {
    public static void main(String[] args) {

        Video v[] = new Video[3];
        v[0]= new Video("Curso de Algoritmo");
        v[1]= new Video("Curso de POO");
        v[2]= new Video("Curso de Java");

        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);


        //criando um usuario
        Usuario user[] = new Usuario[2];
        user[0]= new Usuario("Picashu",22,'M', "Picachuzinho");
        user[1]= new Usuario("Rosaria",20,'F',"Picachuzinho");

        System.out.println(user[0]);
        System.out.println(user[1]);

    }
}
