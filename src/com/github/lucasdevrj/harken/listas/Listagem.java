package com.github.lucasdevrj.harken.listas;

import com.github.lucasdevrj.harken.modelos.Audio;

import java.util.ArrayList;

public class Listagem {
    private ArrayList<Audio> listaAudios = new ArrayList<Audio>();

    public void adicionaAudio(Audio audio) {
        System.out.println("Audio " + audio.getTitulo() + " adicionado!!");
        this.listaAudios.add(audio);
    }

    public void exibeTodosAudios() {
        System.out.println("Lista de audios cadastrados:");
        for (int i = 0; i < this.listaAudios.size(); i++) {
            System.out.println(this.listaAudios.get(i).getTitulo());
        }
    }
}
