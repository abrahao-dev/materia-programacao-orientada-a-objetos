/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testapolinomio;

/**
 *
 * @author Matheus Abrahão
 */
import java.util.Arrays;

public class Polinomio {
    private double[] coeficientes; // coeficientes[0] é o termo constante, coeficientes[1] é o coeficiente de x, etc.

    // Construtor com coeficientes
    public Polinomio(double... coeficientes) {
        this.coeficientes = coeficientes;
    }

    // Construtor que cria um polinômio nulo
    public Polinomio(int grau) {
        this.coeficientes = new double[grau + 1];
    }

    // Métodos de acesso
    public double[] getCoeficientes() {
        return coeficientes;
    }

    public void setCoeficientes(double[] coeficientes) {
        this.coeficientes = coeficientes;
    }

    // Adiciona dois polinômios
    public Polinomio adicionar(Polinomio outro) {
        int grauMax = Math.max(this.coeficientes.length, outro.coeficientes.length);
        double[] coeficientesSoma = new double[grauMax];

        for (int i = 0; i < grauMax; i++) {
            double coef1 = (i < this.coeficientes.length) ? this.coeficientes[i] : 0;
            double coef2 = (i < outro.coeficientes.length) ? outro.coeficientes[i] : 0;
            coeficientesSoma[i] = coef1 + coef2;
        }

        return new Polinomio(coeficientesSoma);
    }

    // Multiplica dois polinômios
    public Polinomio multiplicar(Polinomio outro) {
        int grauResultado = this.coeficientes.length + outro.coeficientes.length - 2;
        double[] coeficientesProduto = new double[grauResultado + 1];

        for (int i = 0; i < this.coeficientes.length; i++) {
            for (int j = 0; j < outro.coeficientes.length; j++) {
                coeficientesProduto[i + j] += this.coeficientes[i] * outro.coeficientes[j];
            }
        }

        return new Polinomio(coeficientesProduto);
    }

    // Avalia o polinômio para um valor específico de x
    public double avaliar(double x) {
        double resultado = 0;
        for (int i = 0; i < coeficientes.length; i++) {
            resultado += coeficientes[i] * Math.pow(x, i);
        }
        return resultado;
    }

    // Método para exibir o polinômio em formato legível
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeficientes.length - 1; i >= 0; i--) {
            if (coeficientes[i] != 0) {
                if (i < coeficientes.length - 1) {
                    sb.append(coeficientes[i] > 0 ? " + " : " - ");
                } else if (coeficientes[i] < 0) {
                    sb.append("- ");
                }
                sb.append(Math.abs(coeficientes[i]));
                if (i > 0) {
                    sb.append("x");
                    if (i > 1) {
                        sb.append("^").append(i);
                    }
                }
            }
        }
        return sb.toString();
    }
}
