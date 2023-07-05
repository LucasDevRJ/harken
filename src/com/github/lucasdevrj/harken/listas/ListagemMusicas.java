package com.github.lucasdevrj.harken.listas;

import com.github.lucasdevrj.harken.modelos.Audio;
import com.github.lucasdevrj.harken.modelos.Musica;

import java.util.ArrayList;

public class ListagemMusicas extends ListagemAudios {
    private ArrayList<Musica> listaMusicas = new ArrayList<Musica>();

    @Override
    public void adiciona(Audio audio) {
        super.adiciona(audio);
    }
}
