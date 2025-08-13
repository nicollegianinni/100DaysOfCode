package coleçoes.Equals;

public class EqualsSmartphoneTest {

    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("123456", "Samsung");
        Smartphone s2 = new Smartphone("123456", "Samsung");


        //observando equals para espaço de memoria
        System.out.println(s1.equals(s2)); // false pois o espaço de memoria é diferente ja que são 2 objetos distintos

        s1 = s2; // ao atrubuir um objeto ao outro é tranferido o espaço de memoria
        System.out.println(s1.equals(s2)); // agora a saida é true



    }
}
