package dates;

import java.text.NumberFormat;
import java.text.ParseException;

//PARSE NUMBER FORMAT: Faz o casting usando parse do number format
// Na classe 'MoedaFormat test' na parte de baixo mostra como fazer o PARSE monetaria

public class ParseNumberFormatTest {
    public static void main(String[] args) {

        NumberFormat[] number = new NumberFormat[3];
        number[0] = NumberFormat.getNumberInstance();

        //O PARSE DO NUMBER FORMAT desconsidera e não continua o parse quando encontra qualquer caracter que nao seja numero
        String valorString = "10_00.2150"; // aqui ele so tras ate o 10
        String valorString2 = "1500,00";  // aqui ele so tras o 1500
        String valorString3 = "1.000"; // APENAS O PONTO(.) ELE CONSIDERA E TRAS OS NUMEROS COMPLETOS
        //Double.parseDouble(valorString); //Modo comum de fazer o casting é atraves de parse dos wrappers mas para esse exemplo vamor usar o do number format
        try { // usamos try cath porque lança uma exception tipo checked IO é obrigatorio tratar
            System.out.println(number[0].parse(valorString));
            System.out.println(number[0].parse(valorString2));
            System.out.println(number[0].parse(valorString3));
        } catch (ParseException e) {
            e.getStackTrace();
        }
        ;

    }
}
