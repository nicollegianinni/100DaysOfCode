package dates;

import java.text.DateFormat;
import java.util.Calendar;

// CLASSE DATE FORMAT É BASTANTE USADA
public class DateFormatTest {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance(); // para mostrar a data de hoje precisa instanciar a classe Calendar e chamar ao final
        DateFormat[] dateFormat = new DateFormat[7]; // Criei um array com os tipos de dataFormat mais usados

        dateFormat[0] = DateFormat.getInstance(); // 18/07/2025 12:13
        dateFormat[1] = DateFormat.getDateInstance(); // 18 de jul. de 2025
        dateFormat[2] = DateFormat.getDateTimeInstance(); //18 de jul. de 2025 12:13:05
        dateFormat[3] = DateFormat.getDateInstance(DateFormat.SHORT); // 18/07/2025
        dateFormat[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); // 18 de jul. de 2025
        dateFormat[5] = DateFormat.getDateInstance(DateFormat.LONG); // 18 de julho de 2025
        dateFormat[6] = DateFormat.getDateInstance(DateFormat.FULL); //sexta-feira, 18 de julho de 2025

        for (DateFormat date : dateFormat) {
            System.out.println(date.format(calendar.getTime()));

        }
    }
}
