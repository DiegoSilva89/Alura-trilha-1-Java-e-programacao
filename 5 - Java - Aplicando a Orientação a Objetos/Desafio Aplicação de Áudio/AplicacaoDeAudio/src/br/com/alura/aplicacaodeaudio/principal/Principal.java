package br.com.alura.aplicacaodeaudio.principal;

import br.com.alura.aplicacaodeaudio.modelos.Musica;
import br.com.alura.aplicacaodeaudio.modelos.Podcast;
import br.com.alura.aplicacaodeaudio.modelos.Preferidas;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Enjoy the Silence");
        minhaMusica.setCantor("Depeche Mode");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();            
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Dev Junior");
        meuPodcast.setApresentador("Diego Silva");

        for (int i = 0; i < 1000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
