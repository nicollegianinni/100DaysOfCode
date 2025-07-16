package utilitaria;

public class WrapperUtilitarias {
    public static void main(String[] args) {

        //tipos primitivos
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean bolleanP = false;

        //classes dos tipos primitivos - Wrapper
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean bolleanW = false;

        //Boxing(autoboxing): faz o java tranformar em wrapper
        Integer numeros = 10;

        //UnBoxing: tranforma primitivo em wrapper
        int i = intW;

        //PARSE tranformando wrappers em Strings

        Integer numero = Integer.parseInt("1");
        System.out.println(numero);

        Boolean verdadeiro = Boolean.parseBoolean("True"); // case insesitive não liga para o formato
        System.out.println(verdadeiro);

        System.out.println(

        );
        //caracter não permite o parse
        //mas eles fazem algumas utilidades
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));

    }
}
