/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogador;

/**
 *
 * @author Matheus Abrahão
 */
public class Time {
    private Jogador[] jogadores;

    // Construtor
    public Time() {
        jogadores = new Jogador[11];
    }

    // Método para adicionar ou substituir um jogador
    public void adicionarOuSubstituirJogador(int posicao, Jogador jogador) {
        if (posicao < 0 || posicao >= 11) {
            throw new IndexOutOfBoundsException("Posição do jogador inválida. Deve estar entre 0 e 10.");
        }
        jogadores[posicao] = jogador;
    }

    // Método para consultar jogador em uma determinada posição
    public Jogador consultarJogador(int posicao) {
        if (posicao < 0 || posicao >= 11) {
            throw new IndexOutOfBoundsException("Posição do jogador inválida. Deve estar entre 0 e 10.");
        }
        return jogadores[posicao];
    }

    // Método para imprimir todos os jogadores
    public void mostrarTime() {
        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i] != null) {
                System.out.println("Posição " + i + ": " + jogadores[i]);
            } else {
                System.out.println("Posição " + i + ": Vazia");
            }
        }
    }
}