package br.com.alura.minhasmusicas;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Best of You");
        minhaMusica.setCantor("Foo Fighters");

        for (int i = 0; i < 1000; i++) { //simulação de reproduções
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Mundo Freak");
        meuPodcast.setApresentador("Andrei Fernandes");

        for (int i = 0; i < 500; i++) {
            meuPodcast.reproduzir();
        }
        for (int i = 0; i < 300; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);




    }
}