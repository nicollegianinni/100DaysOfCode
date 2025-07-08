package polimorfismoExercicio;

public class Visualizacao {
    //agregação - associação
    private Usuario espectador;
    private Video filme;

    public Visualizacao(Usuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido()+1);
        this.filme.setViews(this.getFilme().getViews()+1);

    }
    //sobrecarga de metodo
    public void avaliar(){
        this.filme.setAvaliacoes(5);
    }

    public void avaliar (int nota){
        this.filme.setAvaliacoes(nota);
    }

    public void avaliar (float porcento){
        int tot=0;
        if (porcento <=20){
            tot=3;
        } else if (porcento<=50) {
            tot=5;
        }else if (porcento <=90){
            tot=8;
        }else {
            tot=10;
        }this.filme.setAvaliacoes(tot);
    }

    public Usuario getEspectador() {
        return espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }


    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }
}
