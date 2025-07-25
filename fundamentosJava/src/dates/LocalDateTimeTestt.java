package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

// ESSA CLASSE É A JUNÇÃO DAS CLASSES LOCAL TIME E LOCAL DATE tambem não pode ser instanciada
public class LocalDateTimeTestt {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);// data hora completa de agora

        LocalDateTime localdatetime2 = LocalDateTime.of(2025,Month.JULY,25,23,50);
        System.out.println(localdatetime2); // passando uma data completa

        LocalDate data = LocalDate.of(2022,Month.DECEMBER,25);
        LocalTime time = LocalTime.of(23,58,59);

        System.out.println(data);
        System.out.println(time);

        LocalDate data2 = LocalDate.parse("2025-07-25"); //  tranforma string em LocalDate
        System.out.println(data2);

        LocalTime time2 = LocalTime.parse("23:58:59");
        System.out.println(time2); // tranformou string em time

        //unindo date e time com a classe LocalDateTime
        LocalDateTime localdatetime3 = data.atTime(time);
        System.out.println(localdatetime3);
        LocalDateTime localDateTime2 = time.atDate(data);
        System.out.println(localDateTime2);

    }
}
