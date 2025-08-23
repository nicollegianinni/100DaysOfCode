package coleçoes.Equals;
// EQUALS compara o valor dentro da string nao o espaço de memoria como seria usando ==
public class EqualsTest {
    public static void main(String[] args) {
        String nome1 = "William Suane";
        String nome2 = "William Suane";
        System.out.println(nome1 == nome2); // true pq ele compara a variavel de referencia o nome "william Suane".

        String nome3 = new String("William Suane");
        System.out.println(nome2 == nome3); // false pois  como criou um objeto novo fez um novo espaço de memoria

        //Equals
        System.out.println(nome2.equals(nome3)); // saida true


    }
}
