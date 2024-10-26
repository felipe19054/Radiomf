package com.cursos.radiomf.principal;

import com.cursos.radiomf.modelos.Cancion;
import com.cursos.radiomf.modelos.MisFavoritos;
import com.cursos.radiomf.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("El gran varón");
        miCancion.setCantante("Willie Colón");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Felipe Castro");
        miPodcast.setTitulo("La vida");

        //Canción
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miCancion.reproducciones();
        }

        //Podcast
        for (int i = 0; i < 200; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproducciones();
        }
        System.out.println("Total de Reproducciones: " + miCancion.getTotalReproducciones());
        System.out.println("Total de Me Gusta: " + miCancion.getTotalMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicone(miPodcast);
        favoritos.adicone(miCancion);
    }
}
