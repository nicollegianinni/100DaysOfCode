package polimorfismo2.Test;

import polimorfismo2.Animal;
import polimorfismo2.Mamifero;

public class AnimalTest {
    public static void main(String[] args) {
        Animal gato = new Mamifero("gato", 4,20,4,"Preto/Branco/Laranja/Marrom/Cinza");
        System.out.println(gato); //  chama o metodo toString()

        //add atraves do metodo get e set
        gato.setNome("Gato");


    }

}
