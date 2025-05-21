package arrays;

public class arrayString {

    public static void main(String[] args) {

        String[] nomes = new String [3];
        nomes[0] = "Nicolle";
        nomes[1] = "Gianinni";
        nomes[2] = "Livia";

        System.out.println(nomes[1]);
        System.out.println();
      // Para mostrar todos os nomes faz atraves do laço for

      for (int i =0; i < nomes.length;i++){
          System.out.println(nomes[i]);
      }
    }
}
