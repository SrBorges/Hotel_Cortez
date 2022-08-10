package com.company;

public class Gerente extends Funcionario{

    private int codAcesso;
    private int numCracha;

    public Gerente(String nome, String cpf, String cargo, int codAcesso, int numCracha) {
        super(nome, cpf, cargo);
        this.codAcesso = codAcesso;
        this.numCracha = numCracha;

    }

    @Override
    public void imprimir(){

        System.out.println("Nome: " + getNome());
        System.out.println("Cargo " + getCargo());
        System.out.println("CPF: " + getCpf());
        System.out.println("Código de acesso: " + getCodAcesso());
        System.out.println("Número crachá: " + getNumCracha());
        System.out.println("---------------------------------");

    }

    public int getCodAcesso() {
        return codAcesso;
    }

    public void setCodAcesso(int codAcesso) {
        this.codAcesso = codAcesso;
    }

    public int getNumCracha() {
        return numCracha;
    }

    public void setNumCracha(int numCracha) {
        this.numCracha = numCracha;
    }
}
