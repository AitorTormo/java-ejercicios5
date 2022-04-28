package com.java;

public class Coche {

    // 1. Atributos

    String marca;
    String modelo;
    int año;
    double caballos;
    boolean sport;

    // 2. Constructores

    public Coche() {}

    public Coche(String marca, String modelo, int año, double caballos, boolean sport) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.caballos = caballos;
        this.sport = sport;
    }

    // 3. Métodos


    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", caballos=" + caballos +
                ", sport=" + sport +
                '}';
    }
}
