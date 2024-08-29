/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.usaheranca;

/**
 *
 * @author Matheus Abrahão
 */
public class UsaHeranca {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Matheus");
        p.status();
        
        Cliente c = new Cliente();
        c.setNome("Manuela");
        c.setCodigo(1);
        c.status();
        
        Pessoa p1 = c;
        p1.setNome("Pedro");
        p1.status();
        
        c.status();
        
        Aluno a = new Aluno();
        a.setNome("Silvio");
        a.setRA("1234");
        a.status();
    }
}
