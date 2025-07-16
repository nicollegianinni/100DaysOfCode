package errors.IOException;

import errors.IOException.dominio.Leitor1;
import errors.IOException.dominio.Leitor2;

import java.io.*;

//CLASSE TESTE DAS CLASSES DO MODULO DE DOMINIO: LEITOR 1 E LEITOR 2
//LEITURA E FECHAMENTO DE ARQUIVO READER E CLOSE(), DA CLASSE MÃE Readeable e Closeable
//O JAVA FECHA AUTOMATICO POR IMPLEMENTAR O READER QUE CHAMA O CLOSEBLE (CLOSE())

public class LeitorCloseComResource {

    public static void main(String[] args) { //para rodar o metodo lerArquivo3() precisa da assinatura no main throws IOException

        lerArquivo();

    }

    public static void lerArquivo() { // é obrigatorio
        try (Leitor1 leitor1 = new Leitor1(); // O JAVA FECHA NA ORDEM DE PILHA ABRE LEITOR 1 E LEITOR 2 FECHA O 2 DEPOIS O 1
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {

        }
    }
}