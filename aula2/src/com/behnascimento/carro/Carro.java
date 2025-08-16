package com.behnascimento.carro;

import com.behnascimento.pintura.Pintavel;

public class Carro implements Pintavel {
    protected String modelo;
    String cor;
    int ano;
    String placa;

    //Construtores
    public Carro(String modelo, String cor, int ano, String placa) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.placa = placa;
    }

    //getters e setters


    @Override
    public void aplicarTinta() {

    }
}
