/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversormonetario;

/**
 *
 * @author Matheus Abrahão
 */
public class Valor {
    private double valor;
    private Moeda moeda;

    // Construtor
    public Valor(double valor, Moeda moeda) {
        this.valor = valor;
        this.moeda = moeda;
    }

    // Métodos de consulta
    public double getValor() {
        return valor;
    }

    public Moeda getMoeda() {
        return moeda;
    }

    // Método para converter o valor para outra moeda
    public Valor converterPara(Moeda moedaDestino) {
        return moeda.converterPara(this, moedaDestino);
    }
}