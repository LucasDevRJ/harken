package com.github.lucasdevrj.harken.listas;

import com.github.lucasdevrj.harken.modelos.Audio;

import java.util.ArrayList;

public class ListagemAudios {
    private ArrayList<Audio> listaAudios = new ArrayList<Audio>();
    private ArrayList<Audio> listaCurtidos = new ArrayList<Audio>();

    public ArrayList<Audio> getListaCurtidos() {
        return listaCurtidos;
    }

    public void adiciona(Audio audio) {
        System.out.println("Audio " + audio.getTitulo() + " adicionado!!");
        this.listaAudios.add(audio);
    }

    public void remove(Audio audio) {
        for (int i = 0; i < this.listaAudios.size(); i++) {
            if (this.listaAudios.get(i).equals(audio)) {
                this.listaAudios.remove(audio);
                System.out.println("O audio " + audio.getTitulo() + " foi removido com sucesso!!");
            }
        }
    }

    public void exibeTodosAudios() {
        System.out.println("Lista de audios cadastrados:");
        for (int i = 0; i < this.listaAudios.size(); i++) {
            System.out.println(this.listaAudios.get(i).getTitulo());
        }
    }

    private ArrayList<Audio> adicionaAudioListaCurtidos() {
        for (int i = 0; i < this.listaAudios.size(); i++) {
            if (this.listaAudios.get(i).getCurtidas() > 0) {
                this.listaCurtidos.add(this.listaAudios.get(i));
            }
        }
        return this.listaCurtidos;
    }

    public void exibeAudiosCurtidos() {
        adicionaAudioListaCurtidos();
        System.out.println("Lista de curtidas:");
        for (int i = 0; i < this.listaCurtidos.size(); i++) {
            System.out.println(this.listaCurtidos.get(i).getTitulo());
        }
    }
}
