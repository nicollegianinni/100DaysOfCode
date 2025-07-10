package errors.IOException;

import java.io.File;
import java.io.IOException;

//TRATANDO IO EXCEPTION (ENTRADA E SAIDA)
// o metodo abaixo criará um arquivo de texto na paste da arquivos

public class IOExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\test.txt"); // Você pode criar qualquer arquivo add a extenção (.jpg .js .txt)
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado com sucesso!");
        }catch (IOException e){
           e.printStackTrace();
        }

    }
}
