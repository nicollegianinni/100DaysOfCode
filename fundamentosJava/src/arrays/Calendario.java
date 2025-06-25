package arrays;

public class Calendario {

    public static void main(String[] args) {

        String[] mes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < mes.length; i++) {
            System.out.println("O mes de "+mes[i]+ " tem " + dias[i]+ "dias.");
        }

        System.out.println();
        //outro modo de mostrar usando for each
        for (String c:mes) {
            for (int n:dias)
            System.out.println("O mes de "+ c + " tem "+ n + " dias.");

        }
    }
}
