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
}
