package dates;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

//LOCAL DATE: mostra local e data nao mostra hora. Não pode ser instanciada. Essa classe é mais recente que o Date e Calendar
public class LocalDateTest {
    public static void main(String[] args) {

        //criando Date
        System.out.println(new Date()); //data formato do computador

        //criando Calendar
        System.out.println(Calendar.getInstance());//calendario gregoriano

        //A classe LocalDate
        LocalDate date = LocalDate.of(2022, Month.DECEMBER, 25); //2022-12-25
        LocalDate agora = LocalDate.now();

        System.out.println(date);
        //buscar atraves do get apenas um atributo
        System.out.println(date.getYear()); // ano
        System.out.println(date.getMonth());// mes escrito
        System.out.println(date.getMonth().getValue()); // mes em numeral
        System.out.println(date.getDayOfWeek()); //dia da semana
        System.out.println(date.getDayOfMonth()); // dia do mes
        System.out.println(date.lengthOfMonth()); //se o mes tem 29, 30 ou 31
        System.out.println(date.isLeapYear()); // se o ano é biscesto
        System.out.println(date.get(ChronoField.ALIGNED_WEEK_OF_MONTH)); //semanas no mes
        System.out.println(date); //date advindo do LocalDate vem formato para guardar em abnco de dados
        System.out.println(agora);
        //diferente de date que Date so pode a partir de 1970 essa pode alem
        System.out.println(LocalDate.MAX); // data maxima
        System.out.println(LocalDate.MIN); // data minima

        agora = agora.plusDays(2); // a classe é imutavel (principio da String) para aumentar a data tem que atrubuir a uma variavel
        System.out.println(agora);
    }
}
