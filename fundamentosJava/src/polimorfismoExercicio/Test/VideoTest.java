package polimorfismoExercicio.Test;

import polimorfismoExercicio.Usuario;
import polimorfismoExercicio.Video;
import polimorfismoExercicio.Visualizacao;

public class VideoTest {
    public static void main(String[] args) {

        //criando um objeto array de videos
        Video video[] = new Video[3];
        video[0]= new Video("Curso de Algoritmo");
        video[1]= new Video("Curso de POO");
        video[2]= new Video("Curso de Java");

//saida: toString da classe video
//        System.out.println(v[0]);
//        System.out.println(v[1]);
//        System.out.println(v[2]);


        //criando um objeto array de usuarios
        Usuario user[] = new Usuario[2];
        user[0]= new Usuario("Pikachu",22,'M', "Pikachuzinho");
        user[1]= new Usuario("Rosaria",25,'F',"Rosarinha");

//saida: toString da classe usuario mais a classe pessoa
//        System.out.println(user[0]);
//        System.out.println(user[1]);

        //Criando objeto array de visualições da classe visualização
        Visualizacao [] visu = new Visualizacao[5];
        visu[0] = new Visualizacao(user[0],video[2]);
        visu[0].avaliar(); // chamando metodo de sobrecarga 'avaliar' da classe visualização
        visu[1] = new Visualizacao(user[0],video[2]);
        visu[1].avaliar(10);
        visu[2] = new Visualizacao(user[1],video[0]);
        visu[2].avaliar(50);
        visu[3] = new Visualizacao(user[1],video[2]);
        visu[3].avaliar(91);
        visu[4] = new Visualizacao(user[0],video[0]);
        visu[4].avaliar(20.5f);

//saida: toString() dos objetos da classe visualização criados
        System.out.println(visu[0]);
        System.out.println(visu[1]);
        System.out.println(visu[2]);
        System.out.println(visu[3]);
        System.out.println(visu[4]);


    }
}
