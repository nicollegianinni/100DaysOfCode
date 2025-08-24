package coleçoes.List;

import java.util.ArrayList;
import java.util.List;

public class Lista01 {
    public static void main(String[] args) {
        //NO INICIO JAVA 1.4 ERA ASSIM:
        //List é uma interface e arrayList é uma classe que implementa a List
        //usando polimorfismo faz um Narrowing casting pegando a classe mais generalizada (mãe) para a classe mais especializada (filha).

        List nomes = new ArrayList(); // 1.4 java
        nomes.add("Nicolle");
        nomes.add("Java");
        nomes.add(123); // aceita ate numeros

        //Para ver o que tem na lista | como antes não precisava declarar a variavel então apontava para a classe Object, buscando todos os tipos
        for (Object nome :  nomes) {
            System.out.println(nome);
        }

        System.out.println("-----------------Nova forma de fazer----------------------");
        // DEPOIS DO GENERICS NO JAVA 5 PRECISA INTRODUZIR O TIPO ATRAVES DO DIAMOND <>
//Pode usar ArrayList no inicio, mas não é indicado | Se você souber o tamanho da lista é uma boa opção colocar no parametro ex.: = new ArrayList(300);
        List<String> listaNomes = new ArrayList(); // Depois de java 7 não precisa colocar <String> depois do new = new ArrayLista <String>();
        listaNomes.add("Livia");
        // agora se tentar colocar um numero dará erro. ex.: listaNomes.add(123);

        //Para ver o que tem na lista FOR EACH | agora pode colocar o tipo da variavel especifica ja que declarou ela no <> da Lista
        for (String nomess :  listaNomes) {
            System.out.println(nomess);
        }
        System.out.println();
        //pode add a qualquer momento um novo item na lista
        listaNomes.add("Gianinni");

        //PARA MOSTRAR O QUE TEM DENTRO DA LISTA FOR INDEXADO
        for (int i =0; i < listaNomes.size(); i++){
            System.out.println(listaNomes.get(i));
        }

    }

}
