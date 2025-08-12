package serialization.domain;

import java.io.*;

//CLASSE SERIALIZACLE: quando precisar criar um objeto e salvar em um arquivo (serializar)
//precisa indicar na classe do objeto que ele é um objeto serializado (implements Serializable)
public class Aluno implements Serializable {
//@ serial foi add depois ao final do codigo, depois que você pesquisar e ativar 'ON' o 'serializer (serialVersionUID)'
    @Serial
    private static final long serialVersionUID = -253310244643819453L;
    private Long id;
    private String name;
    private transient String password; // add transient para a senha não ser serializada

    //Por associação, criando atributo de outra classe
    private transient Turma turma;

    private static final String NOME_ESCOLA = "Dev virado no Jiraya"; // não serializa porque pertence a classe

    public Aluno(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    //Metodo para SERIALIZAR A CLASSE TURMA POR ASSOCIAÇÃO
    @Serial
    private void writeObject(ObjectOutputStream oos){
        try{
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome()); // Escreva o atributo
        }catch (IOException e ){
            e.printStackTrace();
        }
    }
    //Metodo para DESERIALIZAR A CLASSE TURMA POR ASSOCIAÇÃO
    @Serial
    private void readObject(ObjectInputStream ois){
        try{
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF(); // le o atributo
            turma = new Turma(nomeTurma);
        }catch (IOException | ClassNotFoundException e ){
            e.printStackTrace();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //get e set da associação da turma
    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", Nome Escola='" + NOME_ESCOLA +'\''+
                ", Turma='" + turma +'\''+
                '}';
    }
}
