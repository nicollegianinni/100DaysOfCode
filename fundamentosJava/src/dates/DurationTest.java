package dates;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

//CLASSE DURATION: para ver o intervalo de tempo entre 2 datas, horas etc
//baseada em segundos e nano segundos (nao trabalha com data, nao pode usar LocalDate pq só trabalha em nanosegundos)
public class DurationTest {
    public static void main(String[] args) {

        LocalDateTime dataAgora = LocalDateTime.now(); // data de hoje
        LocalDateTime data2 = LocalDateTime.now().plusYears(2); // adicionamos 2 anos a data de hoje
        LocalTime horaAgora = LocalTime.now();
        LocalTime hora2 = LocalTime.now().minusHours(2);

        Duration duration = Duration.between(dataAgora,data2);
        Duration duration2 = Duration.between(horaAgora,hora2);
        Duration duration3 = Duration.between(Instant.now(),Instant.now().plusSeconds(1000));
        System.out.println(duration); //dara o resultado em segundos a nansegundos
        System.out.println(duration2);
        System.out.println(duration3);

        System.out.println();
        Duration duration4 = Duration.ofDays(2);
        System.out.println(duration4); // PT48H trara o resultado tranformando a quantidade de dias em segundos


    }
}
