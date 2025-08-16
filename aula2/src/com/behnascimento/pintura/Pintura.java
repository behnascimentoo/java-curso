package com.behnascimento.pintura;

import java.util.List;


public class Pintura<MeuTipo> {
    private List<MeuTipo> coisasQueVouPintar;
    private String tipo;
    private String marca;
    private double preco;

    //construtor
    public Pintura(String tipo, String marca, double preco) {
        this.tipo = tipo;
        this.marca = marca;
        this.preco = preco;
    }

    //getter e setters


    public List<MeuTipo> getCoisasQueVouPintar() {
        return coisasQueVouPintar;
    }

    public void setCoisasQueVouPintar(List<MeuTipo> coisasQueVouPintar) {
        this.coisasQueVouPintar = coisasQueVouPintar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Metodo
    public void pintar(MeuTipo coisa) {
        this.coisasQueVouPintar.add(coisa);
    }
}
