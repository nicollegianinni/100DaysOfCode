package coleçoes.List.Sort;

import java.util.Objects;

public class FilmesSort implements Comparable<FilmesSort> {
    private Long id;
    private String nomeFilme;
    private double preco;

    public FilmesSort(Long id, String nomeFilme, double preco) {
        //Objects.requireNonNull(id,"Id não pode ser nulo!"); // com esse trecho não aceita nulo no id e nome
        //Objects.requireNonNull(nomeFilme, "O nome do filme não pode ser nulo!"); // para testar

        this.id = id;
        this.nomeFilme = nomeFilme;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmesSort that = (FilmesSort) o;
        return Double.compare(that.preco, preco) == 0 && id.equals(that.id) && nomeFilme.equals(that.nomeFilme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeFilme, preco);
    }

    @Override
    public String toString() {
        return "FilmesSort{" +
                "id=" + id +
                ", nomeFilme='" + nomeFilme + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int compareTo(FilmesSort outroFilme) {
        // retorna negativo se o this for menor < que outroFilme  (objeto)
        //se this for == outro filme retorna 0
        // retorna positivo se o this for maior > que o filme
        if (this.id < outroFilme.getId()) {
            return -1;
        }
        if (this.id.equals(outroFilme.getId())) {
            return 0;
        }
        if (this.id.equals(outroFilme.getId())) {
            return 0;
        } else {
            return 1;
        }
    }
}
