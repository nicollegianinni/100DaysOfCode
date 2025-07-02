package Enum;
// usado no design patterns STRATEGGY
// Classe Enum com finalidade de sobreescrever metodos

public enum CategoriaClienteEnum {
    CLIENTE_PRATA{
        @Override
        public double calculeDesconto(double valor) { // metodo
            return valor * 0.05;
        }
    },
    CLIENTE_OURO{
        @Override
        public double calculeDesconto(double valor) { // metodo
            return valor * 0.1;
        }
    };

    // metodo a ser sobrescrito
    public double calculeDesconto (double valor) {

        return valor ;
    }// metodo a ser sobrescrito
}
