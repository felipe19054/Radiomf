package com.cursos.radiomf.modelos;

public class MisFavoritos {
    public void adicone(Audio audio){
        if (audio.getCalificacion() >= 8){
            System.out.println(audio.getTitulo() + " Es uno de los favoritos del momento");
        }else{
            System.out.println(audio.getTitulo() + " También es unos de los favoritos");
        }
    }
}
