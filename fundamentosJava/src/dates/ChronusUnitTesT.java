package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

//A CLASSE CHRONOS UNIT TRABALHA COM UM RANGE DE DATAS, EM DIAS, ANOS, MESES
// E TAMBEM TRANFORMAR AS UNIDADES EM ALGUMA OUTRA QUE QUEIRA
public class ChronusUnitTesT {

    public static void main(String[] args) {

        //
        LocalDateTime niver = LocalDateTime.of(1993, Month.DECEMBER,10,0,0,0);
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(niver,agora));

        LocalDate data1 = LocalDate.now();

        Period p1 = Period.ofWeeks(58);
        System.out.println(p1);

        //com o CHRONOS UNIT ELE PEGA A VARIAVEL QUE ESTA EM DIAS E TRANFORMA ATRAVES DO CHRONOS UNIT
        System.out.println(data1.until(data1.plusDays(p1.getDays()), ChronoUnit.MONTHS));

    }


}
