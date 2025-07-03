package interfaces.Test;

import interfaces.DataLoader;
import interfaces.DatabaseLoader;
import interfaces.FileDataLoader;

public class DataLoaderTest01 {

    public static void main(String[] args) {
        DatabaseLoader databaseLoaderoader = new DatabaseLoader();
        FileDataLoader fileDataLoader = new FileDataLoader();
        databaseLoaderoader.load();
        databaseLoaderoader.remove();
        databaseLoaderoader.checkPermission();
        databaseLoaderoader.checkAutentication();
        System.out.println();
        System.out.println(" ");
        fileDataLoader.load();
        fileDataLoader.remove();
        fileDataLoader.checkPermission();
        fileDataLoader.checkAutentication();

        //Nao pode criar objeto da interface
        // Não pode instanciar tambem uma classe abstract
//        DataLoader dataLoader = new DataLoader();

    }
}
