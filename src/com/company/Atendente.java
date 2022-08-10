package com.company;

public class Atendente extends Funcionario{

    private String login;
    private int senha;

    public Atendente(String nome, String cpf, String cargo, String login, int senha) {
        super(nome, cpf, cargo);
        this.login = login;
        this.senha = senha;

    }

    @Override
    public void imprimir(){

        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Login: " + getLogin());
        System.out.println("Senha: " + getSenha());
        System.out.println("---------------------------------");


    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
