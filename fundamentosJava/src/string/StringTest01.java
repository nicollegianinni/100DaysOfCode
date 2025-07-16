package string;
//string são imutaveis
public class StringTest01 {

    public static void main(String[] args) {

        String nome = "Nicolle"; // String constant pool
        String nome2 = "Nicolle";
        nome.concat(" Gianinni");

        System.out.println(nome == nome2); // dara true:  mesmo concatenado ele apresenta o mesmo espaço de memoria 'Nicolle'
        System.out.println(nome);

        //para concatenar correto teria que por:
        nome = nome.concat(" Gianinni");
        System.out.println(nome == nome2); // dará false: não usa o equals porque estamos comparando o espaço de memoria
        System.out.println(nome);

        //criando nome por objeto
        String nome3 = new String("Nicolle");
        System.out.println(nome2 == nome3);//dara falso: mesmo com mesmo nome, não sera true, pois criando um objeto cria um novo espaço de memoria
        System.out.println(nome2 == nome3.intern()); // agora dara true, pois compara o conteudo do que ta dentro 'Nicolle'
    }


}
