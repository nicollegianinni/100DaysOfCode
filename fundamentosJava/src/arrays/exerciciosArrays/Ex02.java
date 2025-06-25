package arrays.exerciciosArrays;

// Questao 2 - Criada por curso em video
// Execute o trecho Java a seguir e marque a opção que contém o valor que será exibido na tela:
//
//        String s="CURSOEMVIDEO";
//        char[]r=new char[12];
//        for(int c=s.length()-1;c>=0;c--)(
//        r[c]=s.charAt(c);
//        }
//        for(char 1:r){
//        System.out.print(1);
//        }
//        a)OEDIVMEOSRUC
//        b)CURSOEMVIDEO
//        c)01234567891011
//        d)11109876543210

public class Ex02 {
    public static void main(String[] args) {

        String s = "CURSOEMVIDEO";
        char[] r = new char[12];
        for (int c = s.length() - 1; c >= 0; c--) {
            r[c] = s.charAt(c);
        }
        System.out.println();
        for (char n : r) {
            System.out.print(n);
        }
    }
}
