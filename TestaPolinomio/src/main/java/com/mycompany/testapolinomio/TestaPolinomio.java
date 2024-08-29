/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testapolinomio;

/**
 *
 * @author Matheus Abrahão
 */
public class TestaPolinomio {
    public static void main(String[] args) {
        // Criando dois polinômios
        Polinomio p1 = new Polinomio(3, 2, 1); // Representa 3 + 2x + x^2
        Polinomio p2 = new Polinomio(1, -1);   // Representa 1 - x

        // Adicionando os polinômios
        Polinomio soma = p1.adicionar(p2);
        System.out.println("Soma: " + soma);

        // Multiplicando os polinômios
        Polinomio produto = p1.multiplicar(p2);
        System.out.println("Produto: " + produto);

        // Avaliando o polinômio p1 para x = 2
        double resultado = p1.avaliar(2);
        System.out.println("Avaliação de p1 para x = 2: " + resultado);

        // Avaliando o polinômio produto para x = 2
        resultado = produto.avaliar(2);
        System.out.println("Avaliação do produto para x = 2: " + resultado);
    }
}