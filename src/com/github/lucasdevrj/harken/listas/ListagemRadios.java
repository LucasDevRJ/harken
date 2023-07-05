package com.github.lucasdevrj.harken.listas;

import com.github.lucasdevrj.harken.modelos.Radio;

import java.util.ArrayList;
import java.util.Collections;

public class ListagemRadios {

    private ArrayList<Radio> listaRadios = new ArrayList<Radio>();

    public void adiciona(Radio radio) {
        this.listaRadios.add(radio);
        System.out.println("A radio " + radio.getTitulo() + " foi adicionada!");
    }

    public void exibe() {
        System.out.println("Lista de radios cadastradas:");
        Collections.sort(this.listaRadios);
        for (int i = 0; i < this.listaRadios.size(); i++) {
            this.listaRadios.get(i).exibeInformacoes();
        }
    }

    public void remove(Radio radio) {
        this.listaRadios.remove(radio);
        System.out.println("A radio " + radio.getTitulo() + " foi removida!");
    }
}
