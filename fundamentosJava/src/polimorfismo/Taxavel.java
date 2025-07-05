package polimorfismo;
// INTERFACE É UM CONTRATO - TODAS AS CLASSES PRECISAM TER ESSE METODO 'calculaImposto()'
//não é obrigatorio a classe mae abstract 'produto' ter, mas as filhas tem que ter.
public interface Taxavel {
    double calcularImposto();

}
