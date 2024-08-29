/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usaheranca;

/**
 *
 * @author Matheus Abrahão
 */
class Cliente extends Pessoa {
    private int codigo;

    // Método setter para 'codigo'
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    // Sobrescrita do método 'status' para incluir o código do cliente
    @Override
    public void status() {
        super.status(); // Chama o método status da classe Pessoa
        System.out.println("Código: " + codigo);
    }
}
