package dates;

import java.util.Locale;

public class PaisesLinguasLocaleTest {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); // mostra a linguagem que esta seu computador

        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        System.out.println("Essas são as possiveis linguas(sigla): ");
        for (String isoLanguage: isoLanguages) {
            System.out.print(" " +isoLanguage);
        }

        System.out.println();
        System.out.println("Esses são os possiveis paises (sigla): ");

        for (String isoCountry : isoCountries ){
            System.out.print(" " +isoCountry);
        }
    }
}
