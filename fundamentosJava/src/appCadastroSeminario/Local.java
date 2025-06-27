package appCadastroSeminario;
//        Crie um sistema que gerencie seminários
//        sitema deverá cadastrar seminários, estudantes, professores e local onder será realizado
//        Um aluno poderá estar em apenas um seminário
//        Um seminário poderá ter nenhum ou vários alunos
//        Um professor poderá ministrar vários seminários
//        Um seminário deve ter um local
//        Campos básicos (excluindo relacionamento)
//        seminário: título
//        aluno: nome e idade
//        professor: nome, especialidade
//        local:endereço

public class Local {

    private String endereco;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
