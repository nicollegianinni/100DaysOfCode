package dates;


import java.time.LocalDate;
import java.time.Period;
// A CLASSE PERIODO TRABALHA NUM RANGE PARA DATAS. SERVE PARA VER QUANTO DE INTERVALO HA, EM DIAS E ANOS ( nao tranforma dias para meses para isso use a ChronoUnit)
public class PeriodTest {

    public static void main(String[] args) {
        Period periodo = Period.of(2022,12,25);
        System.out.println(periodo); // a saida será P2022Y12M25D onde cada letra representa intuitivamente o ano, mes etc
        System.out.println();

        LocalDate data1 = LocalDate.now();
        LocalDate data2 = LocalDate.now().plusYears(2).plusDays(7);
        Period periodo2 = Period.between(data1,data2);
        System.out.println(periodo2);

        Period x = Period.between(data1,data2);
        Period p1 = Period.ofDays(10);
        Period p2 = Period.ofWeeks(58);
        Period p3 = Period.ofMonths(1);
        Period p4 = Period.ofYears(1);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);


    }
}
