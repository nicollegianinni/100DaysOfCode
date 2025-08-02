package serialization.domain;

import java.io.Serializable;
//CLASSE SERIALIZACLE: quando precisar criar um objeto e salvar em um arquivo (serializar)
//precisa indicar na classe do objeto que ele é um objeto serializado (implements Serializable)
public class Aluno implements Serializable {

    private Long id;
    private String name;
    private String password;

    public Aluno(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
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

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
