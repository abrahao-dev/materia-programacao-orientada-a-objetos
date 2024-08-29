/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classificafigura;

/**
 *
 * @author Matheus Abrahão
 */
public class ProjetoClassificaFigura {
    public static void main(String[] args) {
        // Exemplo 1: Quadrado
        ClassificaFigura quadrado = new ClassificaFigura(5, 5);
        quadrado.mostraStatus();

        // Exemplo 2: Retângulo
        ClassificaFigura retangulo = new ClassificaFigura(5, 10);
        retangulo.mostraStatus();

        // Exemplo 3: Triângulo equilátero
        ClassificaFigura trianguloEquilatero = new ClassificaFigura(3, 3, 3);
        trianguloEquilatero.mostraStatus();

        // Exemplo 4: Triângulo isósceles
        ClassificaFigura trianguloIsosceles = new ClassificaFigura(3, 3, 5);
        trianguloIsosceles.mostraStatus();

        // Exemplo 5: Triângulo escaleno
        ClassificaFigura trianguloEscaleno = new ClassificaFigura(3, 4, 5);
        trianguloEscaleno.mostraStatus();

        // Exemplo 6: Círculo
        ClassificaFigura circulo = new ClassificaFigura(7);
        circulo.mostraStatus();
    }
}
