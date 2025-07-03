package interfaces;
//INTERFACE serve para contrato de implementação, ou seja ser como um formulario a ser implementado nas 'filhas'

public interface DataLoader {
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
}
