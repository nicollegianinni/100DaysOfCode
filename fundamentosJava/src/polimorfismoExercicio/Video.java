package polimorfismoExercicio;

public class Video implements AcoesVideo {

    private String titulo;
    private int avaliacoes;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacoes = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    //metodo constrato interface 'acoes video'

    @Override
    public void play() {
        this.reproduzindo = true;
        System.out.println(" Esta reproduzindo ");
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
        System.out.println(" Esta pausado ");
    }

    @Override
    public void like() {
        this.curtidas++;
        System.out.println(" Você ganhou mais uma curtida! ");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacoes() {
        return avaliacoes;
    }
//MEDIA DE AVALIAÇÕES POR VISUALIZAÇÕES
    public void setAvaliacoes(int avaliacoes) {
        int novaAval;
        novaAval = ((this.avaliacoes + avaliacoes)/this.views);
        this.avaliacoes = novaAval;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacoes=" + avaliacoes +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}
































