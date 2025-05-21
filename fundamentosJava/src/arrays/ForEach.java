package arrays;

public class ForEach {
    // Bastante usado nos arrays

    public static void main(String[] args) {

        System.out.println("For tradional");
        int [] notas = new int [10];
        for (int i =0; i < notas.length;i++){
            System.out.println(notas[i]);
        }
        System.out.println("For each");
        for(int nota : notas){
            System.out.println(nota);
        }
    }
}
