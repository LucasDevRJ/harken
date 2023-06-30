package com.github.lucasdevrj.harken.classificacao;

import com.github.lucasdevrj.harken.modelos.Audio;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Classificacao {
    private ArrayList<Audio> listaAudios = new ArrayList<Audio>();

    public ArrayList<Audio> getListaAudios() {
        return listaAudios;
    }

    public void adicionaAudio(Audio audio) {
        this.listaAudios.add(audio);
    }

    public void exibePosicao() {
        for (int i = 0; i < this.listaAudios.size(); i++) {
            if (this.listaAudios.get(i).getClassificacao() < 3) {
                System.out.println(this.listaAudios.get(i).getTitulo() + " está entre as 3 mais tocadas!!");
            } else if (this.listaAudios.get(i).getClassificacao() < 5) {
                System.out.println(this.listaAudios.get(i).getTitulo() + " está entre as 5 mais tocadas!!");
            } else if (this.listaAudios.get(i).getClassificacao() < 10) {
                System.out.println(this.listaAudios.get(i).getTitulo() + " está entre as 10 mais tocadas!!");
            }
        }
    }
}
