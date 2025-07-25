package dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

//CLASSE LOCALTIME uso o mesmo principio da LocalDate não pode ser instanciada
public class LocalTimeTest {
    public static void main(String[] args) {

        LocalTime time = LocalTime.of(23,010,05);
        LocalTime agora = LocalTime.now();
        System.out.println(time); //23:08:05
        System.out.println(agora); //00:01:33.814874700 (mostra ate os nanosegundos)
        System.out.println(time.getHour());
        System.out.println(time.getSecond());
        System.out.println(time.getMinute());
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM));

        System.out.println(LocalTime.MIDNIGHT); // meia noite
        System.out.println(LocalTime.MIN); // apos meia noite
        System.out.println(LocalTime.MAX); // 23:59:59.99999

    }
}
