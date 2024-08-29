/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversormonetario;

/**
 *
 * @author Matheus Abrahão
 */
import java.util.Scanner;

public class ConversorMonetario {
    public static void main(String[] args) {
        // Definindo as moedas disponíveis
        Moeda real = new Moeda("Real", 1.0);
        Moeda dolar = new Moeda("Dólar", 5.0);
        Moeda euro = new Moeda("Euro", 6.0);

        // Exibindo as opções de moeda para o usuário
        System.out.println("Escolha as moedas disponíveis:");
        System.out.println("1. Real");
        System.out.println("2. Dólar");
        System.out.println("3. Euro");

        // Lendo a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Tipo de moeda de origem
        System.out.print("Escolha a moeda de origem (1, 2 ou 3): ");
        int opcaoOrigem = scanner.nextInt();
        Moeda moedaOrigem = selecionarMoeda(opcaoOrigem, real, dolar, euro);

        // Tipo de moeda de destino
        System.out.print("Escolha a moeda de destino (1, 2 ou 3): ");
        int opcaoDestino = scanner.nextInt();
        Moeda moedaDestino = selecionarMoeda(opcaoDestino, real, dolar, euro);

        // Valor a ser convertido
        System.out.print("Digite o valor a ser convertido: ");
        double valor = scanner.nextDouble();

        // Criando o objeto Valor e realizando a conversão
        Valor valorOriginal = new Valor(valor, moedaOrigem);
        Valor valorConvertido = valorOriginal.converterPara(moedaDestino);

        // Exibindo o resultado
        System.out.printf("Valor convertido: %.2f %s%n", valorConvertido.getValor(), valorConvertido.getMoeda().getNome());

        // Fechando o scanner
        scanner.close();
    }

    // Método auxiliar para selecionar a moeda com base na opção do usuário
    private static Moeda selecionarMoeda(int opcao, Moeda real, Moeda dolar, Moeda euro) {
        switch (opcao) {
            case 1:
                return real;
            case 2:
                return dolar;
            case 3:
                return euro;
            default:
                throw new IllegalArgumentException("Opção inválida.");
        }
    }
}
