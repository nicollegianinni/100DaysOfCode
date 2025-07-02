package Enum;
//Enum usado na ClasseCliente2 e ClienteTest2 com finalidade
public enum TipoContaEnum {
    CONTA_CORRENTE(1, "Conta corrente"),
    CONTA_POUPANÇA(2,"Conta Poupança"),
    CONTA_PJ(3, "Conta PJ");

    public int VALOR ; // Cria se uma variavel int VALOR para guardar o parametro int valor(pq nao imprime no construtor)
    public  String nomeRelatorio; // Cria se uma variavel String para guardar o parametro String e imrpimir na saida

    //Criase um metodo 'TipoContaEnum' passando o para int valor que adicionamos aos Enums 'atributos' criados
    TipoContaEnum(int valor, String nomeRelatorio ) { //passa o parametro int valor pois adicionou aos Enuns 'atributos'

        this.VALOR = valor;  //int VALOR recebe int valor do parametro dos Enuns 'atributos' (pq nao permite this.valor)
        this.nomeRelatorio = nomeRelatorio;
    }
    public int getVALOR() {
        return VALOR;
    }
    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
