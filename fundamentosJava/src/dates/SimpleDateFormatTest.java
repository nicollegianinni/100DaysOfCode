package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

//SIMPLE DATE FORMAT: dentro de uma tabela cada letra representa um tipo de dado
//veja a documentação para adiconar letras que simbolizam algum componente
//https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
public class SimpleDateFormatTest {
    public static void main(String[] args) {
        String pattern = "yyy.MM.dd E G 'at' HH:mm:ss z "; //'at' é para mostrar que se quiser que ignore algo é so por entre aspas
        String exemple = "'Brazil' dd 'de' MMM 'de' YYYY";
        SimpleDateFormat formato = new SimpleDateFormat(pattern);
        System.out.println(formato.format(new Date()));
        System.out.println(exemple.formatted(new Date()));

    }
}
