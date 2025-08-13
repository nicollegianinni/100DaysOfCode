package coleçoes.Equals;

public class EqualsSmartphoneTest {

    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("123456", "Samsung");
        Smartphone s2 = new Smartphone("123456", "Samsung");

        //1 - OBSERVE QUE ELE COMPARA O ESPAÇO DE MEMORIA DOS OBJETOS ATRAVES DO EQUALS
        System.out.println(s1.equals(s2)); // false pois o espaço de memoria é diferente ja que são 2 objetos distintos

        s1 = s2; // ao atrubuir um objeto ao outro é tranferido o ESPAÇO DE MEMORIA ( não compara o que tem dnetro do objeto)
        System.out.println(s1.equals(s2)); // agora a saida é true


        // 2 PARA VER COMPARANDO O QUE TEM DENTRO DO OBJETO, EX.: para ver se o 'SerialNumber' do s1 é igual ao 'SerialNumber' do s2
        // VA NA CLASSE 'Smatphone' e DESCOMENTE o metodo equals 'public boolean equals(Object obj)' da classe





    }
}
