/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.timefutebol;

/**
 *
 * @author Matheus Abrahão
 */
public class Jogador {
    private String nome;
    private int numero;
    private String posicao; // deve ser goleiro, zagueiro, lateral, meia ou atacante

    // Construtor
    public Jogador(String nome, int numero, String posicao) {
        if (!posicao.equals("goleiro") && !posicao.equals("zagueiro") &&
            !posicao.equals("lateral") && !posicao.equals("meia") &&
            !posicao.equals("atacante")) {
            throw new IllegalArgumentException("Posição tática inválida.");
        }
        this.nome = nome;
        this.numero = numero;
        this.posicao = posicao;
    }

    // Métodos para consultar estados
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPosicao(String posicao) {
        if (!posicao.equals("goleiro") && !posicao.equals("zagueiro") &&
            !posicao.equals("lateral") && !posicao.equals("meia") &&
            !posicao.equals("atacante")) {
            throw new IllegalArgumentException("Posição tática inválida.");
        }
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "Jogador [Nome: " + nome + ", Número: " + numero + ", Posição: " + posicao + "]";
    }
}
