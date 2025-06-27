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

public class Professores {

    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime(){
        System.out.println("---------******Dados do Seminario*******-----------");
        System.out.println("Professor: "+ this.getNome());
        System.out.println("Especialização: "+ this.getEspecialidade());
        System.out.println();
        if(seminario==null)return;
        System.out.println("Seminarios cadastrados:  " );
        for(Seminario seminarios : this.seminario){
            System.out.println(seminarios.getTitulo());

            if(seminarios.getLocal()==null)continue;
            System.out.println("Local: " + seminarios.getLocal().getEndereco());
            System.out.println();
            if(seminarios.getEstudante() ==null)continue;
            System.out.println("Alunos");
            for(Estudante estudantes: seminarios.getEstudante())
            System.out.println("Estudante: " + estudantes.getNome() +" idade: "+ estudantes.getIdade()+"");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
}
