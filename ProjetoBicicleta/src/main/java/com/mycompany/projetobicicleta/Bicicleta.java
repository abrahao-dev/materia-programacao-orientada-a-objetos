/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetobicicleta;

/**
 *
 * @author Matheus Abrahão
 */
public class Bicicleta {
    public int codigo;
    public String modelo;
    private String marca; // Se é privado e não tem método que acesse, ela não serve pra nada
    private float velocidade;
    private int marcha;
    private float velocidade_maxima;
    /* a maioria das vezes que tiver um atributo privado, precisa de um atributo público que da um return 
    e acesse a ele, método GET (Lê) e SET (Atribui a ele)
    */
    
    // atalho de teclado alt + insert, selecionamos getter and setter e colocamos apenas as classes privadas

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) { // Boas práticas é sempre usar o mesmo nome, no caso utilizou-se marca
        this.marca = marca; // tudo que tiver com this está ligado ao atributo
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        if(velocidade > this.velocidade_maxima)
            System.out.println("Velocidade Maior que a maxima permitida.");
        else
            this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(String troca) {
        trocar_marcha(troca);
    }

    public float getVelocidade_maxima() {
        return velocidade_maxima;
    }

    public void setVelocidade_maxima(float velocidade_maxima) {
        if(velocidade_maxima > 80)
            System.out.println("Velocidade máxima acima da permitida."); // atalho do teclado sout + tab
        else
            this.velocidade_maxima = velocidade_maxima;
    }
    
    public void status(){ //imprimir tudo na tela  
        System.out.println("------------------------------");
        System.out.println("Caracteristicas da Bicicleta:");
        System.out.println("------------------------------");
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Marcha: " + this.marcha);
        System.out.println("OBS: Velocidade maxima permitida: " + this.velocidade_maxima + "km/h.");
    }
    
    // Sempre criar classes separado do projeto, para deixar fácil de reutilizar caso precise

    public Bicicleta() { 
    //Pode criar quantos construtores quiser, usando o nome
        this.velocidade_maxima = 70;
        this.marcha =1;
    }

    public Bicicleta (float velocidade_maxima) {
        if(velocidade_maxima >80 ) {
            System.out.println("Velocidade maxima acima da permitida.");
            this.velocidade_maxima = 80;
        }
        else
            this.velocidade_maxima = velocidade_maxima;
        this.marcha =1;
    }
    
    private void trocar_marcha(String troca) {
    switch (troca) {
        case "subir" -> {
            if (this.marcha < 11) {
                this.marcha++;
            } else {
                System.out.println("Marcha ja e a maior possível.");
            }
        }
        case "descer" -> {
            if (this.marcha > 1) {
                this.marcha--;
            } else {
                System.out.println("Marcha ja e a menor possivel.");
            }
        }
        default -> System.out.println("Defina se você quer aumentar ou diminuir a marcha.");
    }
}

    public void incrementa_marcha() {
    if (this.marcha < 11) {
        this.marcha++;
    } else {
        System.out.println("Marcha ja e a menor possivel.");
    }
}

public void decrementa_marcha() {
    if (this.marcha > 1) {
        this.marcha--;
    } else {
        System.out.println("Marcha ja e a menor possivel.");
    }
  }
}
