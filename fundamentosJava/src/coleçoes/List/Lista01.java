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
        //NÃO PODE CRIAR NENHUMA LISTA DE VARIAVEL PRIMITIVA TEM QUE SER OBJETO USA O WRAPPER ex.: int, double; tem que ser Integer, Double
        // internamente chama o equals e hashCode e esses não chamam tipos primitivos
//Pode usar ArrayList no inicio, mas não é indicado | Se você souber o tamanho da lista é uma boa opção colocar no parametro ex.: = new ArrayList(300);
        List<String> listaNomes = new ArrayList(); // Depois de java 7 não precisa colocar <String> depois do new = new ArrayLista <String>();
        listaNomes.add("Livia");
        // agora se tentar colocar um numero dará erro. ex.: listaNomes.add(123);
        //Para ver o que tem na lista FOR EACH | agora pode colocar o tipo da variavel especifica ja que declarou ela no <> da Lista
        System.out.println("add 1 item a lista");
        for (String nomess :  listaNomes) {
            System.out.println(nomess);
        }

        //pode add a qualquer momento um novo item na lista
        listaNomes.add("Gianinni");
        listaNomes.add("Gabrielle");
        listaNomes.add("Java");

        System.out.println();
        System.out.println("add varios itens a lista:");
        for (String nomess :  listaNomes) {
            System.out.println(nomess);
        }
        System.out.println();

        // REMOVE
        System.out.println("Removendo index 3");
        listaNomes.remove(3);// deve remover o java
        for (String nomess :  listaNomes) {
            System.out.println(nomess);
        }

        System.out.println();
        System.out.println("Removendo Nome Gabrielle");
        listaNomes.remove("Gabrielle"); // se for identico a String, vai remover Gabrielle da lista
        for (String nomess :  listaNomes) {
            System.out.println(nomess);
        }
        System.out.println();
        System.out.println("Lista por for iterado");
        //PARA MOSTRAR O QUE TEM DENTRO DA LISTA USANDO FOR ITERADO - INDEXADO
        for (int i =0; i < listaNomes.size(); i++){
            System.out.println(listaNomes.get(i));
        }
        System.out.println();
        // OBSERVAÇÕES SOBRE ADD AO ITERA - SE PRECISAR ADD ITEM NA LISTA DENTRO DO FOR
        //Declara uma variavel chamada size e atribui a ela o tamanho da lista

        System.out.println();
        System.out.println("add item cass atraves do for");
        int size = listaNomes.size(); // atribui a ela o tamanho da lista. assim não vai chamar o nome infinitamente.
        for (int i =0; i < size; i++){
            System.out.println(listaNomes.get(i));
            listaNomes.add("Cass");
        }
        System.out.println(listaNomes);
        //todavia essa moto não é uma boa pratica, melhor fazer por filtro

        //ADICIONAR UMA LISTA EM OUTRO
        System.out.println();
        System.out.println("imagina que agora você tem 2 listas (lista abaixo):");
        List<String> listaNomes2 = new ArrayList();
        listaNomes2.add("William");
        listaNomes2.add("Suane");

        for (String nomess :  listaNomes2) {
            System.out.println(nomess);
        }
        System.out.println();
        listaNomes2.addAll(listaNomes);

        System.out.println("Lista nomes 1 add a Lista nomes 2:");
        for (String nomess :  listaNomes2) {
            System.out.println(nomess);
        }

    }

}
