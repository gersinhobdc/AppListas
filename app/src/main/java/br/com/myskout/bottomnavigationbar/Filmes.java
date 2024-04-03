package br.com.myskout.bottomnavigationbar;

public class Filmes {
    private String titulo;
    private String categoria;
    private String descricao;
    private String rating;
    private int imgFilmes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getImgFilmes() {
        return imgFilmes;
    }

    public void setImgFilmes(int imgFilmes) {
        this.imgFilmes = imgFilmes;
    }

    public Filmes(String titulo, String categoria, String descricao, String rating, int imgFilmes) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.descricao = descricao;
        this.rating = rating;
        this.imgFilmes = imgFilmes;
    }
}




