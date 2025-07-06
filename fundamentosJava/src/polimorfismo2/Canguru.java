package polimorfismo2;
//Classe neta de animal e filha de memifero
public class Canguru extends Mamifero{
    //essa classe tem os mesmos atrubutos da classe animal e mamifero
    //Clique em ctrl + o e veja os metodos que podem implementar

    //construtor da classe 'Animal' e da 'Mamifero'
    //os atrbutos 'nome peso idade membros' eram da classe animal
    //e os atrubutos 'corPelo' eram da classe filha 'Mamifero'
    public Canguru(String nome, int peso, int idade, int membros, String corPelo) {
        super(nome, peso, idade, membros, corPelo);
    }
    public Canguru(){

    }

    @Override
    public String locomover() {
        System.out.println("Saltando");
        return locomover();
    }

}
