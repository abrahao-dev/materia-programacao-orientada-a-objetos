/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classificafigura;

/**
 *
 * @author Matheus Abrahão
 */
public class ClassificaFigura {
    private float lado1;
    private float lado2;
    private float lado3;
    private float raio;
    private String tipo;

    // Construtor para figuras com dois lados
    public ClassificaFigura(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = 0;  // Valor não utilizado
        this.raio = 0;   // Valor não utilizado
        
        if (lado1 == lado2) {
            this.tipo = "Quadrado";
        } else {
            this.tipo = "Retângulo";
        }
    }

    // Construtor para figuras com três lados
    public ClassificaFigura(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.raio = 0;   // Valor não utilizado
        
        if (lado1 == lado2 && lado2 == lado3) {
            this.tipo = "Triângulo equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            this.tipo = "Triângulo isósceles";
        } else {
            this.tipo = "Triângulo escaleno";
        }
    }

    // Construtor para círculos
    public ClassificaFigura(float raio) {
        this.lado1 = 0;  // Valor não utilizado
        this.lado2 = 0;  // Valor não utilizado
        this.lado3 = 0;  // Valor não utilizado
        this.raio = raio;
        this.tipo = "Círculo";
    }
    
    // Método para mostrar o status
    public void mostraStatus() {
        System.out.println("Status da Figura:");
        if (lado1 != 0) {
            System.out.println("Lado 1: " + lado1);
        }
        if (lado2 != 0) {
            System.out.println("Lado 2: " + lado2);
        }
        if (lado3 != 0) {
            System.out.println("Lado 3: " + lado3);
        }
        if (raio != 0) {
            System.out.println("Raio: " + raio);
        }
        System.out.println("Tipo: " + tipo);
    }

    // Getters and Setters
    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

