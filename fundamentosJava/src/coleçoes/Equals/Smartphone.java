package coleçoes.Equals;

public class Smartphone {

    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    //METODO EQUALS:  compara atrubutos dentro de um objeto
    //REGRAS:
    // reflexivo: -> x.equals(x) tem que ser true para  tudo que for diferente de null
    //simetrico: para x e y diferente de null, se x.equals(y) == true, logo y.equals(x) == true
    //transitividade: para x e y diferentes de null, se x.equals(y) == true, logo x.equals(z) == true, logo y.equals(z) == true
    //consistente: x.equals(x) ele sempre retorna true se x for diferente de null
    //para x diferente de null, x.equals(null) tem que retornar false
    //DESCOMENTA ESSE CODIGO ABAIXO PARA COMPARAR O QUE TEM DENTRO DO OBJETO ATRAVES DO EQUALS
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) return false;
//        if (this == obj) return true;
//        if (this.getClass() != obj.getClass()) return false;
//        Smartphone smartphone = (Smartphone) obj; // faz um cast para ter certeza que o objeto é um smartphone
//        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
//    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
