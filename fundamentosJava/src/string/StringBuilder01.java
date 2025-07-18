package string;

//CLASSE STRING BUFFER E BUILDER
public class StringBuilder01 {
    public static void main(String[] args) {

        String nome = "William Suane";
        System.out.println();
        nome = nome.concat(" Dev Dojo"); // não concatena apenas se atribuir ao nome
        System.out.println(nome);

        //testando um metodo para imrpimir as posições descritas no parametro
        //precisa atribuir ao nome e pedir p imprimir
        nome = nome.substring(0,3);
        System.out.println(nome); // saida deve ser will

        //PODE MUDAR PARA A CLASSE STRING BUFFER que nada mudara
        StringBuilder sb = new StringBuilder("Wiliam"); // se nao passar nad ano parametro ele cria 16 caracteres
        sb.append(" Dev Dojo").append(" Academy");
        System.out.println(sb); // StringBuilder aparece o nome nao o espaço de memoria pois ele tem to string embutido

        sb.reverse(); // reverte
        System.out.println(sb);
        sb.reverse(); // reverter de volta
        sb.delete(14, 20);
        System.out.println();

    }
}
