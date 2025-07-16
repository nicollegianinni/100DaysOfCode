package errors.IOException;

import java.io.*;

//LEITURA E FECHAMENTO DE ARQUIVO READER E CLOSE(), DA CLASSE MÃE Readeable e Closeable
public class TryWithResource {

    public static void main(String[] args)  { //para rodar o metodo lerArquivo3() precisa da assinatura no main throws IOException

        lerArquivo();
        lerArquivos2();
        //lerArquivo3();

    }
    //uma maneira mais enxuta de tratar
    // por esta sendo inicializada com a classe reader ela implementa todos metodos da classe mae Closeable
    // que só tem um metodo o close();
    // Que vai fechar o arquivo automaticamente apos o tratamento do try catch, do mesmo jeito do lerArquivo2() la em baixo

    public static void lerArquivo() { // é obrigatorio
        try (Reader reader = new BufferedReader(new FileReader("arquivo\\test.txt"))) {

        } catch (IOException e) {

        }
    }


    //é um tratamento antiquado, feio, mas funciona. Preferencialmente deve se fazer o de cima,
    // ja que é redundante usar close() no finally, ja que ele é filho de Closeable que tambem implementa Reader

    public static void lerArquivos2() {
        //Reader precisa de um tratamento pois cai num exception checada
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("arquivo\\test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close(); //fecha o arquivo indenpendente do catch, mas close tambem precisa de tratamento try catch
                    System.out.println("Arquivo fechado");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //Na terceira forma de fazer usamos a primeira forma
    // porem sem o catch logo temos que implementar o throws apos o metodo
    public static void lerArquivo3() throws IOException { // é obrigatorio
        try (Reader reader = new BufferedReader(new FileReader("arquivo\\test.txt"))) {


        }
    }
}