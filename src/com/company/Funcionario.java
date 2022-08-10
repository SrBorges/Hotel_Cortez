package com.company;

public class Funcionario {

    private String nome;
    private String cpf;
    private String cargo;


    public Funcionario(){


    }


    public Funcionario(String nome, String cpf, String cargo){

        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;

    }


    public void imprimir(){



    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
