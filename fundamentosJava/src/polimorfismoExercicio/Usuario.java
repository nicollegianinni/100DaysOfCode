package polimorfismoExercicio;

public class Usuario extends Pessoa implements AcoesVideo{

    private String login;
    private int totalAssistido;

    //metodo construtor da classe mae 'Pessoa'
    public Usuario(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login =login;
        this.totalAssistido=0;
    }

    //metodo proprio
    public void viuMaisUm() {
    }

    //metodo abstract implementado na classe
    public void ganharExperiencia(){

    }

    //metodos do contrato interface 'acoesVideos'
    @Override
    public void play() {

    }
    @Override
    public void pause() {
    }

    @Override
    public void like() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "Classe Usuario{" +
                "login='" + login + '\'' +
                ", totalAssistido=" + totalAssistido+
                ", " + super.toString()+
                '}';
    }
}
