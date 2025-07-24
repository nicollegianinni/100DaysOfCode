package dates;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
//NA CLASS LOCALE TEM O CURRENCY: onde mostra como é representado graficamente as moedas de cada pais
// EM BAIXO TEM O PARSE DE MOEDA
public class MoedasFormatTest {
    public static void main(String[] args) {
        NumberFormat.getNumberInstance();
        Locale localeBR = new Locale("pt", "BR");
        Locale LocaleDefault = Locale.getDefault();
        Locale localIT = Locale.ITALY;
        Locale localJP = Locale.JAPAN;
        Locale localeCH = Locale.CHINA;
        NumberFormat[] nfa = new NumberFormat[5];

        nfa[0] = NumberFormat.getCurrencyInstance(); // formato do meu computador
        nfa[1] = NumberFormat.getCurrencyInstance(localIT); // Italia euro
        nfa[2] = NumberFormat.getCurrencyInstance(localeBR); // real BR
        nfa[3] = NumberFormat.getCurrencyInstance(localJP); // yen moeda japonesa
        nfa[4]= NumberFormat.getCurrencyInstance(localeCH);// moeda chinesa

        double valor = 1000.2130;
        for (NumberFormat numberFormat : nfa) {
//            System.out.println(numberFormat.getMaximumFractionDigits()); // mostra a quantidade de numero apos a virgula
//            numberFormat.setMaximumFractionDigits(2); // para setar a quantidade de numeros apos a virgula
            System.out.println(numberFormat.format(valor));
        }

        //PARSE EM MOEDAS DA CLASSE NUMBER FORMAT: tem que fazer o parse da moeda para numero (copia e cola como a moeda sai no console)
        String valorString = "R$ 1.000,21"; //copiei o numero do nfa[0] conforme saiu no console (quando copia vem junto esse  )
        String valorString2 = "￥1,000"; // copiei como sai no console a moeda japonesa
        //Double.parseDouble(valorString); //Modo comum de fazer o casting é atraves de parse dos wrappers mas para esse exemplo vamor usar o do number format
        // usamos try cath porque lança uma exception tipo checked IO é obrigatorio tratar
        try {
            System.out.println(nfa[0].parse(valorString)); // passara de formato String BR e JP para moeda sem formatação
            System.out.println(nfa[3].parse(valorString2));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
