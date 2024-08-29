/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliente;

/**
 *
 * @author Matheus Abrahão
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjetoCliente {
    public static void main(String[] args) {
        // Criação de uma lista de clientes
        
        // Inicializando o Scanner com gerenciamento de recursos
        try (Scanner scanner = new Scanner(System.in)) {
        List<Cliente> listaClientes = new ArrayList<>();

        /* Instanciando e adicionando clientes à lista
        Cliente cliente1 = new Cliente(1, "Matheus", "123.456.789-00", "(11) 91234-5678", "Rua A", 100, "Bairro A", "Cidade A", "Estado A", "12345-678", "Brasil");
        Cliente cliente2 = new Cliente(2, "Manuela", "987.654.321-00", "(21) 91234-5678", "Rua B", 200, "Bairro B", "Cidade B", "Estado B", "87654-321", "Brasil");

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);

        */
        
        while (true) {
            System.out.print("Digite o codigo do cliente (0 para sair): ");
            int codigo = scanner.nextInt();
            
            // Saia do loop se o código for 0
            if (codigo == 0) {
                break;
            }

            // Consome a nova linha após a leitura do inteiro
            scanner.nextLine();

            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o CPF do cliente: ");
            String cpf = scanner.nextLine();

            System.out.print("Digite o telefone do cliente: ");
            String telefone = scanner.nextLine();

            System.out.print("Digite o logradouro do cliente: ");
            String logradouro = scanner.nextLine();

            System.out.print("Digite o numero do cliente: ");
            int num = scanner.nextInt();
            
            // Consome a nova linha após a leitura do inteiro
            scanner.nextLine();

            System.out.print("Digite o bairro do cliente: ");
            String bairro = scanner.nextLine();

            System.out.print("Digite a cidade do cliente: ");
            String cidade = scanner.nextLine();

            System.out.print("Digite o estado do cliente: ");
            String estado = scanner.nextLine();

            System.out.print("Digite o CEP do cliente: ");
            String cep = scanner.nextLine();

            // País é definido como Brasil por padrão, não precisa ser solicitado
            Cliente cliente = new Cliente(codigo, nome, cpf, telefone, logradouro, num, bairro, cidade, estado, cep, null);

            listaClientes.add(cliente);
        }
        
         // Exibindo os clientes cadastrados
        System.out.println("\nClientes cadastrados:");
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente.getNome() + " - " + cliente.getCpf());
        }
        scanner.close();
    }
  }
}