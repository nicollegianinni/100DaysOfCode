package polimorfismo2.Test;

import polimorfismo2.Animal;
import polimorfismo2.Canguru;
import polimorfismo2.Mamifero;

//CLASSE PARA TESTAR CLASSE CANGURU NETA DE ANIMAL
public class AnimalTest2 {
    public static void main(String[] args) {

        //criando objeto atraves da classe mais especializada 'Canguru'
        Animal animal1 = new Canguru("Canguru",60,100,4,"multicores");
        System.out.println(animal1);

        // criando objeto a partir de 'Mamifero'
        Animal animal2 = new Mamifero("Canguru",60,100,4,"colorido");
        System.out.println(animal2);

        //Note que os 2 assumiram o mesmo resultado com classes diferentes
    }


}
