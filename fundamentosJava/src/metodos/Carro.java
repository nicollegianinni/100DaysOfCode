package metodos;

// Adição do modificador 'FINAL' NA CLASSE nao permitimos ela ser extendida em outra
// Tente, crie uma outra classe: Ferrari que poderia herdar de Carro, mas como colocamos final nao conseguimos extender
// Adição de FINAL NO METODO (como vemos no metodo abaixo: imprime()) nao permite que esse método seja subescrito em outra classe.

public final class Carro {

    private String nome;
    private String cor;
    private int ano;

    public final void imprime(){
        System.out.println("Com o modificador FINAL no metodo imprime()\n " +
                "nao conseguimos adiconar esse metodo nas classes filhas.\n" +
                "Exemplo: Remova a palavra final dessa classe Carro la em cima (public final class Carro)\n" +
                "Depois crie uma classe Ferrari adicione extends Carro\n " +
                "Agora dentro de Ferrari crie dentro o metodo imprime() igual temos aqui\n" +
                "nao permitira! mas ao retirar a palavra final do metodo public final void imprime(),\n" +
                "você podera subescrever o metodo normalmente.\n" +
                "Depois va no modulo test e CarroTest e tente chamar, imprimira esse texto.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
