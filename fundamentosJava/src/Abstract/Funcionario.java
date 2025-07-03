package Abstract;
//CLASSE ABSTRATA MÃE
//Criada para resolver problema de design, de desenho de codigo.
// imagine numa empresa com varios cargos (gerente,desenvolvedor,cordenador etc)
// Cria se uma classe funcionario é um template, um modelo de como ser seguido
//A classe abstract é um template, nao pode ser instanciada
// NÃO PODE ter um metodo abstrato numa classe concreta

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;
    protected Cargo cargo;// criei um ENUM so para mostrar impresso os cargos mais organizados
    protected double PRL;

    public Funcionario(String nome, double salario, Cargo cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;

        //calculaBonus();  se tivesse um metodo abstrato nessa classe, usaria o metodo no construtor

    }
    //metodo abstrato herdado da classe mae Pessoa, se a mae aderir ao metodo as filhas tem que aderir
    //as filhas que editarao o corpo desse metodo
    public abstract void Status();

    //metodo concreto herdado da classe abstract avo Pessoa
    // essa metodo as filhas podem ou nao aderir por nao ser concreto
    public void NIS(){
        System.out.println("NIS Ativo");
    }

    //metodo para calcular um bonus PRL dependendo do cargo dos funcionarios
    public double calculaPRL() {
        if (cargo.equals(Cargo.DESENVOLDEDOR)) {
            PRL = salario*3;
            return PRL;
        } else if (cargo.equals(Cargo.GERENTE)) {
            PRL = salario*5;
            return PRL;
        } else if (cargo.equals(Cargo.AGILE_MASTER)) {
            PRL = salario*2;
            return PRL;
        }return 0;
    }
    //OU usa um METODO ABSTRACT SEM CORPO PARA AS OUTRAS CLASSES SOBREESCREVER EM CADA CLASSE
//    public  abstract void calculaBonus();
    // esse mesmo metodo deve ser criado nas classes que extendem a classe abstract,
    // mesmo que vazio, deve cumprir o contrato

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", cargo=" + cargo +
                ", PRL=" + calculaPRL() +
                ", Status: " +  +
                '}';
    }
}
