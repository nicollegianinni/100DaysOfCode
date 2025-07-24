package dates;

import java.util.Calendar;
import java.util.Date;
//CLASS CALENDAR: mostra detalhado o dia do mes, semana etc
//Porem para mostrar a hora, em qual quer classe, tem que instanciar a classe Date e chamar o metodo getTime()
public class CalendarTest {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance(); // quando usa esse metodo esta passandoa  data de hoje implicitamente em formato de numeros
        if (c.getFirstDayOfWeek() == Calendar.SATURDAY){
            System.out.println("Hoje é sabado!");
        } else {
            System.out.println("Hoje ainda não é sabado!");
        }

       // getTimeInMills mostra informações completas porem complexas ao entendimento
        c.getTimeInMillis();
        System.out.println(c);

        // usando getTime é mais entendivel
        System.out.println(c.getTime());

        //tipos usados em calendar
        System.out.println(c.get(Calendar.DAY_OF_WEEK)); //6
        System.out.println(c.get(Calendar.DAY_OF_MONTH)); //18
        System.out.println(c.get(Calendar.DAY_OF_YEAR)); //199
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //3 -> quantas vezes o dia na semana ocorreu dnetro do mes ( é a 3 sextafeira do mes)
        Date date = c.getTime(); //Fri Jul 18 16:07:35 BRT 2025
        System.out.println(date);

        //mudando as horas ou dias etc
        c.add(Calendar.HOUR,12);
        c.add(Calendar.DAY_OF_MONTH,2);
        System.out.println(c.getTime());

        //fazendo roll voltando a hora
        c.roll(Calendar.HOUR,12);
        c.roll(Calendar.DAY_OF_MONTH,2);
        System.out.println(c.getTime());

    }

}
