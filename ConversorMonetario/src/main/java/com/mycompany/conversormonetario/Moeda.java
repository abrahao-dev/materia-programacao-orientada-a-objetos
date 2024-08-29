/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversormonetario;

/**
 *
 * @author Matheus Abrahão
 */
public class Moeda {
    private String nome;
    private double cotacaoParaReal;

    // Construtor
    public Moeda(String nome, double cotacaoParaReal) {
        this.nome = nome;
        this.cotacaoParaReal = cotacaoParaReal;
    }

    // Métodos de consulta
    public String getNome() {
        return nome;
    }

    public double getCotacaoParaReal() {
        return cotacaoParaReal;
    }

    // Método para converter um valor para outra moeda
    public Valor converterPara(Valor valor, Moeda moedaDestino) {
        double valorEmReal = valor.getValor() * this.cotacaoParaReal;
        double valorConvertido = valorEmReal / moedaDestino.getCotacaoParaReal();
        return new Valor(valorConvertido, moedaDestino);
    }
}