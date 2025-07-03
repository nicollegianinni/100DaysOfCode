package interfaces;

public class DatabaseLoader implements DataLoader, DataRemover{

    //metodo da interface DataLoader, aqui mostra a parte de visualização public
    @Override
    public void load() {
        System.out.println("Carregando um arquivo do banco de dados");
    }
    //metodo da interface DataRemover
    @Override
    public void remove() {
        System.out.println("Removendo um arquivo do banco de dados");
    }

    @Override
    public void checkAutentication() {
        DataLoader.super.checkAutentication();
        System.out.print ("do bando de dados...");
    }
    // Esse metodo static foi criado para mostrar que nao pode subescrever da interface mas
    // nao pode ser subescrita pelas classes filhas implementadas porque é statico
    //pode criar mas sera outro metodo
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieve data max da interface");
    }
}
