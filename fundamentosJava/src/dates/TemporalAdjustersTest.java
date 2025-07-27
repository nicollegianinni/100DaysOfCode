package dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

//CLASSE TEMPORAL ADJUSTERS: ajusta o tempo as datas (não ajusta hora)
// USANDO A INTERFACE CHRONUS FIELD PARA MUDAR A DATA

public class TemporalAdjustersTest {
    public static void main(String[] args) {

        //MODO TRADICIONAL COMO TROCAR DATA
        LocalDate agora = LocalDate.now(); // data de hoje
        System.out.println(agora);//imprimindo a data de hoje

        agora = agora.withDayOfMonth(20); // troca a data e atribuindo a variavel 'agora'
        System.out.println(agora);// imprimindo a data de hoje + 20 dias
        System.out.println(agora.getDayOfWeek());// imprimindo qual dia da semana será

        agora = agora.withMonth(1); // troca o mes. ex.: pelo mes 1
        System.out.println(agora);

        agora =agora.withYear(2); // troca o ano. ex.: aqui ficaria ano 0002
        System.out.println(agora);

        // TROCANDO A DATA USANDO CHRONUS FIELD
        LocalDate hoje = LocalDate.now(); //criando a variavel hoje com a data de hoje
        hoje = hoje.with(ChronoField.DAY_OF_MONTH,1);
        System.out.println(hoje);

        hoje = LocalDate.now(); // restartei a variavel hoje para ser novamente a data de hoje
        System.out.println(hoje);

        //USANDO TEMPORAL ADJUSTERS
        hoje = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY)); //data da proxima sexta feira
        System.out.println(hoje);

        hoje = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)); //sexta passada
        System.out.println(hoje);

        hoje = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)); //proxima sexta
        System.out.println(hoje);

        hoje = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()); // primeiro dia do mes
        System.out.println(hoje);

        hoje = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()); // ultimo dia do mes
        System.out.println(hoje);

        hoje = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek());

        hoje = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear()); // primeiro dia do proximo ano
        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek()); // qual dia da semana sera

    }

}
