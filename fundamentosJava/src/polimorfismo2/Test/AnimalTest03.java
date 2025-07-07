package polimorfismo2.Test;

import polimorfismo2.Cachorro;

//TESTE DA CLASSE CACHORRO - SOBRECARGA
public class AnimalTest03 {
    public static void main(String[] args) {
       // Instancia da classe cachorro para usar os metodos de sobrecarga
        Cachorro animal4 = new Cachorro("lulu da pomerania", 3, 10, 4, "branco");
        System.out.println(animal4);
        animal4.reagir("late");
        animal4.reagir(123);
        animal4.reagir(true);

    }
}
