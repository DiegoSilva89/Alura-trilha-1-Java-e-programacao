package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int Temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPosEpisodio;

    public int getTemporadas() {
        return Temporadas;
    }

    public void setTemporadas(int temporadas) {
        Temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPosEpisodio() {
        return minutosPosEpisodio;
    }

    public void setMinutosPosEpisodio(int minutosPosEpisodio) {
        this.minutosPosEpisodio = minutosPosEpisodio;
    }
}
