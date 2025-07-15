package errors.Finally;

//EXEMPLO DE FINALLY CRIANDO UMA CLASS (METODO) PARA A EXCEÇÃO CHAMANDO NA MAIN
public class FinallyDevDojo2 {
    public static void main(String[] args) {
        abreConexao();
        System.out.println();
        abreConexao2();


    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo conexão...");
            System.out.println("Verificando indexs no banco de dados");

            //throw new RuntimeException(); // supondo uma exceção para mostrar que o finally rodará
            //para criar essa exceção tera que tranformar o metodo em void e remover os returns

            return "Conexão aberta com banco de dados!";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo banco de dados.");
        }
        return null;
    }

    //É RARO MAS PODE USAR TRY COM FINALLY PARA ALGO MUITO ESPECIFICO
    public static void abreConexao2 (){
        try {
            System.out.println("Abrindo conexão...");
            System.out.println("Verificando indexs no banco de dados");
            throw new RuntimeException(); // supondo uma exceção para mostrar que o finally rodará

        } finally {
            System.out.println("Fechando recurso liberado pelo banco de dados.");
        }

    }

}
