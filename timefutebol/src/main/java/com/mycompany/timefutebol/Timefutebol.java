/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.timefutebol;

/**
 *
 * @author Matheus Abrahão
 */
public class Timefutebol {
    public static void main(String[] args) {
        // Criar um time
        Time time = new Time();

        // Criar jogadores
        Jogador jogador1 = new Jogador("João", 1, "goleiro");
        Jogador jogador2 = new Jogador("Pedro", 2, "zagueiro");
        Jogador jogador3 = new Jogador("Lucas", 3, "lateral");
        Jogador jogador4 = new Jogador("Carlos", 4, "meia");
        Jogador jogador5 = new Jogador("Ana", 5, "atacante");

        // Adicionar jogadores ao time
        time.adicionarOuSubstituirJogador(0, jogador1);
        time.adicionarOuSubstituirJogador(1, jogador2);
        time.adicionarOuSubstituirJogador(2, jogador3);
        time.adicionarOuSubstituirJogador(3, jogador4);
        time.adicionarOuSubstituirJogador(4, jogador5);

        // Mostrar o time
        System.out.println("Time atual:");
        time.mostrarTime();

        // Consultar jogador em uma posição específica
        System.out.println("\nConsultando jogador na posição 2:");
        Jogador jogadorConsultado = time.consultarJogador(2);
        System.out.println(jogadorConsultado);
    }
}