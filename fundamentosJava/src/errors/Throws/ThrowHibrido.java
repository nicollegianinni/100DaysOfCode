package errors.Throws;

import java.io.File;
import java.io.IOException;

// No Runtime Exception (os não checados) o THROW NEW (lançe uma nova exceção) não precisa colocar assinatura no metodo
// mas no IOException (os checadas precisam)
// Ha casos que não é interessante tratar a exception, numa compra não realizada por exemplo
//é interessante que o programa repita a operação para o cliente poder tentar de novo.

public class ThrowHibrido {
    //EM METODO PUBLICO: É BOA PRATICA USAR THROWS POR NAO SABER QUEM USARA O METODO
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();

    }

    // EM METODO PRIVADO: É BOA PRATICA TRATAR COM TRY CATCH PORQUE NINGUEM MAIS USARÁ
    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\test.txt"); // Você pode criar qualquer arquivo add a extenção (.jpg .js .txt)
        try {
            boolean isCriado = file.createNewFile();//quem lança expection é esse metodo: createNewFile(), que na documentação ja dizia.
            System.out.println("Arquivo criado com sucesso!");//é obrigatorio ter throws na assinatura do metodo criarNovoArquivo()
        } catch (IOException e) {
            e.printStackTrace();
            throw e; //RELANÇA PARA ALCANÇAR O OBJETIVO - AQUI QUE USARIAMOS O EXEMPLO DE 'DAR UMA NOVA TENTATIVA PARA O CLIENTE PAGAR'
           // throw new RuntimeException("Problema na hora de criar o arquivo.") // outro jeito de avisar sobre a exception
        }// com THROW NEW remove a assinatura no codigo main 'throws IOException', onde o metodo 'criarNovoArquivo' é chamado.

    }

    //HIBRIDO:  TRY CATCH E THROW
    // CARRINHO DE COMPRAS - PAGAMENTO FALHOU - CLIENTE TENTAR PAGAR NOVAMENTE
    // VOCÊ QUER QUE MOSTRE NO CONSOLE AO CLIENTE POREM QUER QUE PERMITA TENTAR DE NOVO SEM TRATAR.
}

