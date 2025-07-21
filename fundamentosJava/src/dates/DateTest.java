package dates;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date data = new Date(); // passando no parametro passara o dia de hoje 1752866602804L
        System.out.println(data.getTime()); //gera a data de hoje em milisegundos
        System.out.println(data);


    }
}
