package dates;

import java.text.NumberFormat;
import java.util.Locale;
//CLASSE FORMAT PARA NUMEROS: mostra como cada pais escrevem os numeros virgular espaços etc
public class numerosFormatTest {
    public static void main(String[] args) {
        NumberFormat.getNumberInstance();
        Locale localeBR = new Locale("pt", "PT");
        Locale LocaleDefault = Locale.getDefault();
        Locale localIT = Locale.ITALY;
        Locale localJP = Locale.JAPAN;
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localIT);
        nfa[2] = NumberFormat.getInstance(localeBR);
        nfa[3] = NumberFormat.getInstance(localJP);

        double valor = 10_000.2130;
        for (NumberFormat numberFormat : nfa) {
//            System.out.println(numberFormat.getMaximumFractionDigits()); // numeros apos a virgula - pode determinar quanto numeros você quer no parametroex.:(2)
            System.out.println(numberFormat.format(valor));
        }
        System.out.println();

        double valor2 = 1_000.2150;
        for (NumberFormat numberFormat1 : nfa) {
            numberFormat1.setMaximumFractionDigits(2); // para setar a quantidade de numeros apos a virgula
            System.out.println(numberFormat1.format(valor2));
        }


    }
}
