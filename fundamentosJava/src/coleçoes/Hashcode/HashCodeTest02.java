package coleçoes.Hashcode;
import java.util.HashSet;
// Exemplo de HASHCODE, usando o HashSet onde só de indexar um valor unico onde não pode ser substituido
// como exemplo do CPF, que não pode criar outro objeto se o CPF ja existir.
public class HashCodeTest02 {

    public static void main(String[] args) {
        HashSet<Cliente> clientes = new HashSet<>();

        clientes.add(new Cliente("111.111.111-11", "Maria"));
        clientes.add(new Cliente("222.222.222-22", "João"));
        clientes.add(new Cliente("111.111.111-11", "Maria Souza")); // mesmo CPF

        System.out.println(clientes); // só saira os 2 CPFs ja que o 3 é igual ao 1
    }
}


