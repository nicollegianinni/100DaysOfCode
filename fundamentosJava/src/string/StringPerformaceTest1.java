package string;
// TESTANDO A PERFORMACE DA STRING: rodando programa ve se o tempo gasto para execução USAR: dominios representa o mundo real
//USANDO A CLASSE SPRING BUILDER: alta performace, muito rapido USAR: se concatenar muitas strings
// USANDO A CLASSE STRING BUFFER: organiza sincroniza o acesso multiThead ao metodo USAR:
public class StringPerformaceTest1 {
    public static void main(String[] args) {

        //PERFORMACE STRING COMUM
        long inicio = System.currentTimeMillis();
        concatString(10); // pode digitar 10 ou 100 ou 1000
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para  a String " + (fim -inicio) + "ms");

        //STRING BUILDER
        long inicio2 = System.currentTimeMillis();
        stringBuilder(10); // pode digitar 10 ou 100 ou 1000
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo gasto para  a String " + (fim2 -inicio2) + "ms");

        //STRING BUFFER
        long inicio3 = System.currentTimeMillis();
        stringBuffer(10); // pode digitar 10 ou 100 ou 1000
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo gasto para  a String " + (fim3 -inicio3) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
            System.out.println(texto); // esse da 15 ms
        }
    }

    // CLASSE STRING BUILDER
    private static void stringBuilder(int tamanho2) {
        StringBuilder sb = new StringBuilder(tamanho2); // cria um objeto 'sb' da classe Spring Builder usando o parametro
        for (int i = 0; i < tamanho2; i++) {
            sb.append(i);
            System.out.println(sb); // esse da 0 ms
        }
    }

    //MUTIPLAS THREADS: varias threads acessando o mesmo recurso
    private static void stringBuffer(int tamanho3) {
        StringBuffer sb = new StringBuffer(tamanho3); // cria um objeto 'sb' da classe Spring Builder usando o parametro
        for (int i = 0; i < tamanho3; i++) {
            sb.append(i);
            System.out.println(sb); // esse da 0 ms
        }
    }

}
