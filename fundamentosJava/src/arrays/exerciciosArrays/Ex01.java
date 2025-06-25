package arrays.exerciciosArrays;

//Questao 1 - da Aeronautica
// Considerando o trecho de código Java representado a seguir:
//        int v[]=(2,0,3,9};
//                v[v[2]]=v[v[1]];
//                for(int i:v){
//                System.out.print(i);
//                }
//        O que será impresso na tela?
//                a)2 0 3 2
//                b)2 0 3 9
//                c)2 0 0 9
//                d)0 2 0 9


public class Ex01 {
    public static void main(String[] args) {

        System.out.println("Questao 1");
        //Passando para javanês

        int v[] = {2, 0, 3, 9};
        v[2] = v[1];
        for (int i : v) {
            System.out.print(i);

        }
        System.out.println();
        System.out.println("Resposta é letra C : 2 0 0 9");
    }
}
