package dates;

import java.text.NumberFormat;
import java.util.Locale;

public class numberFormatTest {
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
            System.out.println(numberFormat.format(valor));
        }

    }
}
