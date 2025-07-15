package errors.RuntimeException;
//PARA RODAR ESSA CLASSE ABRA NESSE MESMO PACOTE A CLASS: 'MINHA CLASSE EXCEPTION'
//Observe que havera 4 erros:
// Erro 1 e 2:  que numeros nao podem ser divididos por zero.
//3 erro: que tem menos numeros em 'denom', portanto não tera como dividir o ultimo array de 'numeros'
// 4 erro: o numero da posição [2] nos arrays nao podem ser expressos pois são interos e o resultoado deles dara um double
// Criou se uma class: 'MINHA CLASSE EXCEPTION' para realizar esse tratamento
//e inseriu um 'throw new' chamando essa classe (obs.: o metodo dela mostrara em vermelho

public class UsandoMinhaException {
    public static void main(String[] args) {

      //OPÇÃO 2 : CRIANDO UMA CLASSE FAZER O TRATAMENTO DO TRY CATCH COMO TA NO FINAL DO CODIGO LINHA 48
        //PARA TESTAR COMENTE O CODIGO DA OPÇÃO 1
      // teste();

        //OPÇÃO 1: CRIAR UMA CLASSE EXTENDENDO DE EXCEPTION E DEPOIS CHAMAR NO MAIN
                int[] numeros = {4, 8, 5, 32, 64, 128};
        int[] denom = {2, 0, 2, 0, 4};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 != 0) {
                    throw new MinhaClasseException(numeros[i],denom[i]);
                }
                System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i] / denom[i]));
            }
            catch (MinhaClasseException e) {
                System.out.println(e);
                e.printStackTrace();
            }
            catch (ArithmeticException ex){
                System.out.println("Não pode dividir por zero!");
                ex.printStackTrace();
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Não pode dividir por um numero que não existe!");
                exc.getMessage();
                exc.printStackTrace();
            }
        }
        System.out.println("fim do programa");
    }


    //OPÇÃO 2: OUTRA MANEIRA DE FAZER É CRIANDO UMA CLASSE FAZENDO O TRATAMENTO
    // CRIANDO METODO E CHAMANDO NA CLASSE PRINCIPAL MAIN (ACIMA)
    // APENAS O METODO: TESTE();
    //PARA TESTAR COMENTE O CODIGO DA OPÇÃO 1
//
//    public static void teste(){
//        int[] numeros = {4, 8, 5, 32, 64, 128};
//        int[] denom = {2, 0, 2, 0, 4};
//
//        for (int i = 0; i < numeros.length; i++) {
//            try {
//                if (numeros[i] % 2 != 0) {
//                    throw new MinhaClasseException(numeros[i],denom[i]);
//                }
//                System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i] / denom[i]));
//            }
//            catch (MinhaClasseException e) {
//                System.out.println(e);
//                e.printStackTrace();
//            }
//            catch (ArithmeticException ex){
//                System.out.println("Não pode dividir por zero!");
//                ex.printStackTrace();
//            }
//            catch (ArrayIndexOutOfBoundsException exc) {
//                System.out.println("Não pode dividir por um numero que não existe!");
//                exc.getMessage();
//                exc.printStackTrace();
//            }
//        }
//    }
}
