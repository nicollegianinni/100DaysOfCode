package dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
//USANDO A CLASSE FIELD QUE PODE TROCAR AS DATAS EX.: DATA DE HOJE POR ALGUM DIA ESPECIFICO
public class ChronusFieldTest {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now(); //criando a variavel hoje com a data de hoje
        hoje = hoje.with(ChronoField.DAY_OF_MONTH,1);
        System.out.println(hoje);
    }
}
