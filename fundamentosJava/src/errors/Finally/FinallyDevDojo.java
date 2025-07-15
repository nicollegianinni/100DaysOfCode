package errors.Finally;
//IMPORTANTE PARA FECHAMENTO DE ARQUIVOS OU FINALIZAR CONEXÕES COM BANCO DE DADOS
//Se abrir o recurso você fecha
public class FinallyDevDojo {
    public static void main(String[] args) {
        try {
            System.out.println("abrindo arquivo...");
            throw  new RuntimeException(); // supondo uma exceção para mostrar que o finally rodará
            //System.out.println("escrevendo dados no arquivo");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
