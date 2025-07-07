package polimorfismo2;

public class Cachorro extends Mamifero {

    //Observe que ao extender a classe mae 'mamifero' ele adquire os atributos da avo 'Animal', e tambem da mae ' Mamifero'
    public Cachorro(String nome, int peso, int idade, int membros, String corPelo) {
        super(nome, peso, idade, membros, corPelo);
    }

    public Cachorro() {
        super();
    }

    //METODO 'reagir' DA PROPRIA CLASSE USANDO POLIMORFISMO DE SOBRECARGA tem 3 metodos reagir com assinaturas diferentes
    public void reagir(String comando) {
        if (comando.equals("late")) {
            System.out.println("Au au au!");
        } else if (comando.equals("senta")) {
            System.out.println("Cachorro esta sentado.");
        }
    }

    public void reagir(int contar) {
        if (contar == 123) {
            System.out.println("Cachorro se esconde");
        }
    }

    public void reagir(boolean adestrado){
        if (adestrado){
            System.out.println("Cachorro adestrado se senta");
        } else {
            System.out.println("Cachorro nao adestrado. Não entende o comando.");
        }
    }


    //METODOS ABSTRACTS DA CLASSE AVO 'ANIMAL' NÃO É OBRIGATORIO USAR NAS CLASSES NETAS SO NA FILHA
//    @Override
//    public String locomover() {
//        return super.locomover();
//    }
//
//    @Override
//    public String alimentar() {
//        return super.alimentar();
//    }
//
//    @Override
//    public String emitirSom() {
//        return super.emitirSom();
//    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + this.getNome() + '\'' +
                ", peso=" + this.getPeso() +
                ", idade=" + this.getIdade() +
                ", membros=" + this.getMembros() +
                ", tipo de Agua=" + this.getCorPelo()  +
                '}';
    }
}
