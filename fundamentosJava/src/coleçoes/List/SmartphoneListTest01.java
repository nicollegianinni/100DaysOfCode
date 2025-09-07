package coleçoes.List;

import java.util.ArrayList;
import java.util.List;

//USANDO LISTA COM OBJETOS
public class SmartphoneListTest01 {
    public static void main(String[] args) {
        SmartphoneList s1 = new SmartphoneList("123456", "Samsung");
        SmartphoneList s2 = new SmartphoneList("111111", "Pixel");
        SmartphoneList s3 = new SmartphoneList("2222Y0", "Iphone");

        List<SmartphoneList> listSmartphone = new ArrayList<>(6);
        listSmartphone.add(s1);
        listSmartphone.add(s2);
        listSmartphone.add(s3);
        //listSmartphone.add(0,s3); se quiser a na posição antes so add colocando index antes
        //listSmartphone.clear(); limpa toda lista

        for (SmartphoneList lista: listSmartphone) {
            System.out.println(lista.toString());
        }

        // ADD A LISTA UM OBJETO QUE JA EXISTE - POSSIVEL DUPLICADO
        SmartphoneList s4 = new SmartphoneList("2222Y0", "Iphone");

        // CHECAR PELO CONTAINS
        System.out.println(listSmartphone.contains(s4)); // s4 ja esta na lista ? se sim retorna true, se nao false

        //CHECAR PELO EQUALS
        System.out.println(s4.equals(s3)); // é o mesmo que chamar equals

        // CHECAR PELO INDEX -  se ele não encontrar o index na lista retorna -1
        int indexSmartphone4 = listSmartphone.indexOf(s4); // checa se o objeto criado ja existe, e tras o index
        System.out.println(indexSmartphone4); // mostra a posição do index [2]
        listSmartphone.add(s4); // add à lista como um index novo [ultima posição index 3]

        System.out.println(listSmartphone.get(indexSmartphone4));

        System.out.println();
        for (SmartphoneList lista: listSmartphone) {
            System.out.println(lista.toString());
        }

        // se quiser a na posição antes so add colocando index antes, como o ultimo exemplo abaixo:
        //listSmartphone.add(s1);
        //listSmartphone.add(s2);
        //listSmartphone.add(s3);
        //listSmartphone.add(0,s3);

    }
}
