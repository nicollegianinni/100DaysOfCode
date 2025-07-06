package polimorfismo2.Test;

import polimorfismo2.Animal;
import polimorfismo2.Ave;
import polimorfismo2.Mamifero;

//POLIMORFISMO DE SOBREPOSIÇÃO: substituimos o um metodo da superclasse numa subclasse com a mesma assinatura
//POLIMORFISMO DE
public class AnimalTest {
    public static void main(String[] args) {
        Animal gato1 = new Mamifero("gato", 4,20,4,"Preto/Branco/Laranja/Marrom/Cinza");
        //  chama o metodo toString()
        System.out.println(gato1);

        //POLIMORFISMO é sobre isso, os mesmo metodos para objetos diferentes
        //mesmo metodo, com mesma assinatura, e formas diferentes de resposta dependendo do objeto
        System.out.println("-----------------");
        //OBJETO GATO:
        Animal gato = new Mamifero();
        //add atraves do metodo get e set
        gato.setNome("Gato");
        gato.setIdade(20);
        gato.setMembros(4);
        gato.setPeso(4);
        System.out.println(gato);

        System.out.println("-----------------");

        //OBJETO ARARA
        Animal arara = new Ave();
        //add atraves do metodo get e set
        arara.setNome("Arara Azul");
        arara.setIdade(70);
        arara.setMembros(2);
        arara.setPeso(2);
        System.out.println(arara);



    }

}
