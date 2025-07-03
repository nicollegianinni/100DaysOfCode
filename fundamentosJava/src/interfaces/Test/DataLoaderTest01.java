package interfaces.Test;

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
    }
}
