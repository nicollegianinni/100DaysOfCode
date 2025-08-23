package coleçoes.Hashcode;

import java.util.Objects;
// EXEMPLO DE CODIGO USANDO HASH
// Regras HashCode: Quando se faz uma busca com array se compara com equals, num array grande demora.
// Hash gera um valor esse valor é usado pelo java pare indexar na coleção, e buscar mais rapido.
// Alex ( cada letra significa uma letra) A= 1, l =12, e = 5 , x = 24 ; total = 42 )
// É usado principalmente em estruturas de dados beseadas em hashing:
// - hashMap: chave-valor; permite apenas um valor de hash, se for adicionado outro ele susbstitui.
// - hashSet: Apenas valores unico; permite apenas um unico valor de hash, não podendo ser substituido.
// - hashTable: Chave-valor, porem não é tao utilizado, preferindo usar atraves do hashmap + colletions.syncronizeMap() ou ConcurrentHashMap
// Tem que ter cuidado se o hash nao conflitar exemplo, nome Dirk da 42 também.
// É um numero que vai ser gerado de preferencia unico para cada objeto, tem que dar metch no equals com as regras abaixo.
// se x.equals(y) == true, y.hashcode() == x.hascode()
// y.hashcode() == x.hashcode() não necessariamente o equals de y.equals(x) tem que ser true
// se x.equals(y) == false
// y.hashcode != x.hashcode(), x.equals(y) deverá ser false.
public class Cliente {
    private String cpf;
    private String nome;

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    // Dois clientes são iguais se tiverem o mesmo CPF
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf); // usa só o CPF no hash
    }

    @Override
    public String toString() {
        return nome + " (" + cpf + ")";
    }

}
