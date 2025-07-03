package interfaces;
//INTERFACE serve para contrato de implementação, ou seja ser como um formulario a ser implementado nas 'filhas'
// É uma boa pratica utilizar interface entrando no conceito de programação orientada a interface,
// desacoplando  o codigo e fazendo um melhor uso do polimorfismo
import java.security.PublicKey;

public interface DataLoader {
    //PODE CRIAR ATRUBUTOS, TODOS ATRIBUTOS CRIADOS NA INTERFACE SÃO STATICOS E FINAIS OU SEJA CONSTANTES.
    public static final int MAX_DATA_SIZE =10;
    //Como é uma constante te que declarar o valor
    // public observe que o static final é redundante vem por padrão
    //o certo seria escrever assim:
    int MIN_DATA_SIZE=1;
    //Por padrão o metodo ja vem implicitamente escrito 'public abstract' por isso fica inutilizavel (cinza).
    // então nao precisa escrever no metodo, é redundante.
    // E por ser abstract nao precisa de {body};
    public abstract void load();

    //A partir de Java 8, pode usar o metodo DEFAFULT para escrever no {corpo} criando um metodo na interface
    //E esse metodo nao precisa escrever nas classes 'filhas' implementadas,  ja esta implicitamente.
    // Na classe Test> 'DataLoaderTest01' você vera que o objeto poderá chamar o metodo (checkPermission)
    // sem existe esse metodo nas classes.
    //Mas se quiser pode criar o metodo e sobreescrever tambem.
    default void checkPermission(){
        System.out.println("Checando permissão...");
    }

    //metodo DEFAULT que vou sobreescrever nas classes 'filhas' impelementadas
    default void checkAutentication(){
        System.out.print("Checando autenticação "); // na classe DataLoaderTest01 vera que cada classe completara de alguma forma a saide de dados
    }

    //PODE SER CRIADOS METODOS STATICOS DENTRO DAS INTERFACES
    // nao pode ser subescrita pelas classes filhas implementadas porque é statico
    //pode criar mas sera outro metodo
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieve data max da interface");
    }
}
