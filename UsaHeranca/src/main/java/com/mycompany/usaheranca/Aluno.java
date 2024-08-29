/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usaheranca;

/**
 *
 * @author Matheus Abrahão
 */
public class Aluno extends Pessoa {
    private String RA;
    
    public String getRa() {
        return RA;
    }
        
    // Método setter para 'RA'
    public void setRA(String RA) {
        this.RA = RA;
    }

    // Método para exibir o status do aluno, incluindo RA e informações herdadas de Pessoa
    @Override
    public void status() {
        System.out.println("RA: " + this.RA);
        System.out.println("Nome: " + super.nome);
    }
}
