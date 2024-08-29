/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cliente;

/**
 *
 * @author Matheus Abrahão
 */
public class Cliente {
    private int codigo;
    private String nome;
    private String cpf;
    private String telefone;
    private String logradouro;
    private int num;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String pais;

    //construtor padrao
    public Cliente() {
        this.pais = "Brasil"; // País padrão definido como Brasil
    }  

    public Cliente(int codigo, String nome, String cpf, String telefone, String logradouro, int num, String bairro, String cidade, String estado, String cep, String pais) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.logradouro = logradouro;
        this.num = num;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.pais = pais != null ? pais : "Brasil";  // Verifica se o país é fornecido, caso contrário, define como Brasil

    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNum() {
        return num;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public String getPais() {
        return pais;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setPais(String pais) {
        this.pais = pais != null ? pais : "Brasil";  // Verifica se o país é fornecido, caso contrário, define como Brasil
    }
}
