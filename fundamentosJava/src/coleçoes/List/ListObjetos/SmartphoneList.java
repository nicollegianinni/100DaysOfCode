package coleçoes.List.ListObjetos;

public class SmartphoneList {
    //atributos
    private String serialNumber;
    private String marca;

    //metodo construtor
    public SmartphoneList(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    //metodos get e set
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
    // SO CONSEGUIRA TER A SAIDA CORRETA PARA O CONTAINS SE TIVER O METODO EQUALS E O METODO HASHCODE (MODIFICADO)
    //metodo equals() modificado
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o ) return true;
        if (this.getClass() != o.getClass()) return false; // garante que a comparação seja com objetos da mesma classe. Ex.: Classe SmartphoneList e não NotbookList
        SmartphoneList smartphoneList = (SmartphoneList) o; // Casting de objeto de objeto para smartphoneList (pq o parametro de equals é sempre do objeto)
        return serialNumber != null && serialNumber.equals(smartphoneList.serialNumber); // certifica que não seja nulo e compara com o serial number que você quer.
    }

    //metodos gashcode()
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode(); // PERADOR TERNARIO: compara se a condição é verdadeira se não faz essa ação
        //   SE SERIAL NUMBER  FOR IGUAL A NULO ? RETORNE 0; SE NÃO, RETORNE SERIAL NUMBER DO HASHCODE;
    }

    //metodo toString()
    @Override
    public String toString() {
        return "SmartphoneList{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }


}

