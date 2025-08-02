package serialization.test;

import serialization.domain.Aluno;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// CLASSE SERIALIZATION transforma objeto em array de partes e add em um arquivo .ser
//Para a serialização funcionar precisa implementar na classe do objeto  'Classe aluno' desse package.
//Trabalha em baixo nivel, você usa NIO IO, classe ObjetctOutputStream para salvar o objeto no arquivo
//CRIADO ARQUIVO NA PASTA DO DIRETORIO 'ARQUIVO' DESSE PROJETO
//Para serializar remova as // e add no //seriazilar(aluno1); vice versa.
public class AlunoSerializacaoTest01 {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1L, "livia", "123456");
        serializar(aluno1);
        desserializar();
    }

    //cria um objeto para salvar em um arquivo
    //OUT PUT STREAM É UMA CLASSE QUANDO QUER ESCREVER
    private static void serializar(Aluno aluno1) {
        Path path = Paths.get("arquivo/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
        oos.writeObject(aluno1);
        }catch (IOException e ){
            e.printStackTrace();
        }
        System.out.println("criado objeto " + aluno1);
    }

    //Nao precisa de objeto no parametro (variavel de referencia) pq o objeto ja esta no arquivo
    // nao é out put stream: você nao quer escrever nada, criar nada.
    // para leitura é in put stream.
    private static void desserializar() {
        Path path = Paths.get("arquivo/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject(); // exceção: add aluno por conhecer a classe mas pode nao ser um aluno
            System.out.println(aluno); // para ver o objeto 'aluno1' do arquivo que sera deserializado
        }catch (IOException | ClassNotFoundException e ){
            e.printStackTrace();
        }
    }
}
