package dates;

import java.time.Instant;
import java.time.LocalDateTime;

//CLASSE INSTANT TRABALHA COM RANGE DE NANOSEGUNDOS E SEGUNDOS
//ex.: 2025-07-26T02:27:11.367210Z mostra conforme a zona que foi salva no computador
// usa se a zona UTC zona neutra
public class InstantTest {
    public static void main(String[] args) {

        //nao pode insciar
        Instant now = Instant.now(); // mostra a data de agora commpleta
        System.out.println(now);
        System.out.println(now.getNano());// retorna um inteiro em segundos
        System.out.println(now.getEpochSecond()); //retorna um long nano segundos
        System.out.println(Instant.ofEpochSecond(3));

        System.out.println();

        //diferença para a LocalDate
        System.out.println(LocalDateTime.now());

    }
}
