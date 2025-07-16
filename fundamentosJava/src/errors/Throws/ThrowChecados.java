package errors.Throws;
// No Runtime Exception (os não checados) o THROW NEW (lançe uma nova exceção) não precisa colocar assinatura no metodo
// mas no IOException (os checadas precisam)
// Ha casos que não é interessante tratar a exception, numa compra não realizada por exemplo
//é interessante que o programa repita a operação para o cliente poder tentar de novo.

import java.io.File;
import java.io.IOException;

public class ThrowChecados {
    //EM METODO PUBLICO: É BOA PRATICA USAR THROWS POR NAO SABER QUEM USARA O METODO
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();

    }
    // EM METODO PRIVADO: É BOA PRATICA TRATAR COM TRY CATCH PORQUE NINGUEM MAIS USARÁ
    private static void criarNovoArquivo() throws IOException { // AO ADD THROWS NA ASSINATURA DO METODO VOCÊ LANÇA PARA OUTRO TRATAR

        File file = new File("arquivo\\test.txt"); // Você pode criar qualquer arquivo add a extenção (.jpg .js .txt)

        boolean isCriado = file.createNewFile(); //quem lança expection é esse metodo: createNewFile(), que na documentação ja dizia.
        System.out.println("Arquivo criado com sucesso!");//é obrigatorio ter throws na assinatura

        //HIBRIDO:  TRY CATCH E THROW
        // CARRINHO DE COMPRAS - PAGAMENTO FALHOU - CLIENTE TENTAR PAGAR NOVAMENTE
        // VOCÊ QUER QUE MOSTRE NO CONSOLE AO CLIENTE POREM QUER QUE PERMITA TENTAR DE NOVO SEM TRATAR.
    }
}
