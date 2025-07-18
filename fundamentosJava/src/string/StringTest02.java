package string;
//METODOS STRINGS
public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Maria";
        System.out.println(nome.charAt(4)); // posições da string posição 4 = a

        //mostrar o tamanho da string atraves do metodo length
        //nos numeros mostra o tamanho do array
        //nas Strings tambem mostra quantidade de letras
        System.out.println(nome.length()); //saida: 5

        //metodo replace mudar a letra por outra
        System.out.println(nome.replace("i", "y"));

        //UpperCase
        System.out.println(nome.toUpperCase());

        //LowerCase
        System.out.println(nome.toLowerCase());

        //tamanho começando de onde você quer, sempre termina menos um numero. Obs o ex abaixo.
        String numeros = "012345";
        System.out.println(numeros.substring(0,2)); // assim retorna entre tais numeros
        System.out.println(numeros.substring(3)); // assim retorna da posição ate o final do array

        //remove valores em branco do inicio e fim
        String senha = "   12345   ";
        System.out.println(senha);
        System.out.println(senha.trim());


    }
}
