package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int caragaHoraria;

    public Curso() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCaragaHoraria() {
        return caragaHoraria;
    }

    public void setCaragaHoraria(int caragaHoraria) {
        this.caragaHoraria = caragaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", caragaHoraria=" + caragaHoraria +
                '}';
    }
}
