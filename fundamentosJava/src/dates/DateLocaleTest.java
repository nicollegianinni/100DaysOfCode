package dates;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
// CLASS LOCALE: configuração de localidade e lingua (country e lenguage)
public class DateLocaleTest {
    public static void main(String[] args) {

        //procura na ISO qual lingua e pais você quer informar a data
        //ISO LINGUAS: ISO 639 E PAISES ISO 3766 (lingua portugues PT-BR)
        // EX ITALIA
        Locale localeItaly = new Locale("it", "IT");//italia
        Locale localeSuica = new Locale("it", "CH");//suiça
        Locale localeBrazil = new Locale("pt","BR");//brazil
        Locale localeIndia = new Locale("hi", "IN"); //india
        Locale localeJapao = new Locale("ja", "JP"); //japones

        Calendar calendar = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,localeIndia);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL,localeJapao);

        //saida das datas
        System.out.println("italia: " + df.format(calendar.getTime()));//italia: lunedì 21 luglio 2025
        System.out.println("Suiça: " + df2.format(calendar.getTime())); //Suiça: lunedì, 21 luglio 2025
        System.out.println("Brazil: " + df3.format(calendar.getTime())); //Brazil: segunda-feira, 21 de julho de 2025
        System.out.println("India: " + df4.format(calendar.getTime())); //India: सोमवार, 21 जुलाई 2025
        System.out.println("Japao: " + df5.format(calendar.getTime())); //Japao: 2025年7月21日月曜日

        //paises de acordo com sistema operacional da maquina.
        // Mas você pode adicionar o parametro e colocar a lingaugem que você quer
        System.out.println(localeItaly.getDisplayCountry(localeItaly));
        System.out.println(localeBrazil.getDisplayCountry(localeJapao));
        System.out.println(localeJapao.getDisplayCountry(localeJapao));

        //exemplo site da amazon que tem como colocar localidade www.amazon.nl -> amazon holanda
        //porem tem como escolher o idioma ingles por ex.

    }
}
