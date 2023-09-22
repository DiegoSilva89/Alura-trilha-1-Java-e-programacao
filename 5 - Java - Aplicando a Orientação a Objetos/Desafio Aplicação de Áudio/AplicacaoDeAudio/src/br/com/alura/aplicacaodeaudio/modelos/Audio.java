package br.com.alura.aplicacaodeaudio.modelos;

public class Audio {
    private String titulo;
    private int totalDeReprocucoes;
    private int totalDeCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReprocucoes() {
        return totalDeReprocucoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte() {
        this.totalDeCurtidas++;
    }

    public void reproduz() {
        this.totalDeReprocucoes++;
    }
}
