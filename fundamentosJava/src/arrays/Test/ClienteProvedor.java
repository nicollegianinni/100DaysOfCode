package arrays.Test;

import arrays.Cliente;
import arrays.ProvedorInternet;

//USANDO INTERFACE : IMPRIME - para mostrar que a interface implementa o metodo que é subscrito diferente em cada classe (Cliente e ProvedorInternet).
public class ClienteProvedor {

    public static void main(String[] args) {

        //metodo imprime() na classe Cliente: implementa apenas o nome dos clientes sem array
        Cliente cliente1 = new Cliente("jose");
        cliente1.imprime();
        System.out.println();

        // aqui vemos o mesmo metodo aplicado a uma estancia de objeto array[]
        Cliente cliente2 = new Cliente("Marcia");
        Cliente cliente3 = new Cliente("Flavio");
        Cliente[] clientes = {cliente2, cliente3};
        //para mostrar um array é necessario implementar o for ou for each
        for (Cliente cli : clientes) {
            cli.imprime();
        }

        //observe que saira nome e um espaço de memoria
        System.out.println();
        ProvedorInternet provedor = new ProvedorInternet("Vivo", clientes);
        provedor.imprime();

//        //agora saira: Eliza e os 2 nomes cliente2 e cliente3
//        System.out.println();
//        ProvedorInternet provedor01 = new ProvedorInternet("Tim", clientes);
//        for (ProvedorInternet prov: provedor01){
//            prov.imprime();
//        }
    }
}



