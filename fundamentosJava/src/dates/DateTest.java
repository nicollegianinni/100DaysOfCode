package dates;

import java.util.Date;
//CLASS DATE: Para imprimir o horario
// Muitos metodos não são mais indicados usar pelo java ter criado outra class substituindo-o.
//Porem para mostrar a hora em qualquer outra classe(Locale, Calendar)
// tem que instanciar a classe Date e usar o metodo getTime()
//Com exceção da classe DateFormat que ela ja mostra a hora com seu metodo .getDateTimeInstance();
public class DateTest {
    public static void main(String[] args) {
        Date data = new Date(); // passando no parametro passara o dia de hoje 1752866602804L
        System.out.println(data.getTime()); //gera a data de hoje em milisegundos
        System.out.println(data);


    }
}
