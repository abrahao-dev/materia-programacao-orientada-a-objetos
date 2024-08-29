/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetobicicleta; // é obrigatório dizer qual pacote a classe está

/**
 *
 * @author Matheus Abrahão
 */
public class ProjetoBicicleta { // classe

    public static void main(String[] args) { // método
        // System.out.println("Hello World!"); // atalho do teclado sout + tab
        
        Bicicleta minhaBike = new Bicicleta(); // Instanciando um objeto do tipo bibicleta
        minhaBike.codigo = 1;
        minhaBike.modelo = "BMX Street";
        minhaBike.setMarca("Caloi");  // Atribuindo a marca "Caloi"
        minhaBike.setMarcha("subir");
        minhaBike.setVelocidade(69);
        minhaBike.status();
        
        Bicicleta minhaBike2 = new Bicicleta(50);
        minhaBike2.codigo = 2;
        minhaBike2.modelo = "BMX Race";
        minhaBike2.setMarca("Caloi");  // Atribuindo a marca "Caloi"
        minhaBike2.decrementa_marcha();
        minhaBike2.setVelocidade(49);
        minhaBike2.status();
// Se eu não estou na classe Bicicleta que foi criado na outra página, eu não tenho acesso à este atributo
    }
}

// Build Success no terminal significa que deu tudo certo
