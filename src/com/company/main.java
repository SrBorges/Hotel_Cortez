package com.company;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import com.company.Comand;

public class main {

    public static void main(String[] args){

        Comand comand = new Comand();
        List<Funcionario> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);


        int op1, op2;

        System.out.println("1 - Gerente. ");
        System.out.println("2 - Atendente. ");

        System.out.println("Informe seu cargo de acesso: ");
        op1 = sc.nextInt();

        switch(op1){

            case 1:
                System.out.println("Informe seu nome: ");
                String nome1 = sc.next();
                System.out.println("Informe seu CPF: ");
                String cpf1 = sc.next();
                System.out.println("Informe o código de acesso: ");
                int codAcess = sc.nextInt();

                list.add(new Gerente(nome1, cpf1, "Gerente", codAcess, 4219));

                for(Funcionario lis : list){

                    lis.imprimir();

                }

                comand.showCrud();

                System.out.println("Informe a opção desejada: ");
                op2 = sc.nextInt();

                switch(op2){
                    case 1:
                        System.out.println("Informe o nome: ");
                        comand.nome = sc.next();
                        System.out.println("Informe o número da reserva: ");
                        comand.numReserva = sc.next();
                        System.out.println("Informe a data de entrada: ");
                        comand.dataEntrada = sc.next();
                        System.out.println("Informe os dias de permanência: ");
                        comand.diasPerm = sc.nextInt();
                        comand.create();

                        break;

                    case 2:
                        comand.read();
                        break;

                    case 3:
                        System.out.println("Informe o valor do depósito: ");
                        comand.pagamento = sc.nextDouble();
                        System.out.println("Informe o id pagador: ");
                        comand.atualizar = sc.nextInt();
                        comand.update();
                        break;

                    case 4:
                        System.out.println("Informe a baixa do cliente: ");
                        comand.excluir = sc.nextInt();
                        comand.delete();
                        break;

                    default:
                        System.out.println("Opção inválida. ");

                }

                break;

            case 2:
                System.out.println("Informe seu nome: ");
                String nome2 = sc.next();
                System.out.println("Informe seu CPF: ");
                String cpf2 = sc.next();
                System.out.println("Informe o login: ");
                String login = sc.next();
                System.out.println("Informe a senha: ");
                int senha = sc.nextInt();

                list.add(new Atendente(nome2, cpf2, "Atendente", login, senha));

                for(Funcionario lis : list){
                    lis.imprimir();

                }

                comand.showCrud();

                System.out.println("Informe a opção desejada: ");
                op2 = sc.nextInt();

                switch(op2){
                    case 1:
                        System.out.println("Informe o nome: ");
                        comand.nome = sc.next();
                        System.out.println("Informe o número da reserva: ");
                        comand.numReserva = sc.next();
                        System.out.println("Informe a data de entrada: ");
                        comand.dataEntrada = sc.next();
                        System.out.println("Informe os dias de permanência: ");
                        comand.diasPerm = sc.nextInt();
                        comand.create();

                        break;

                    case 2:
                        comand.read();
                        break;

                    default:
                        System.out.println("Acesso negado. ");


                }

            break;
            default:
                System.out.println("Opção inválida. ");



        }




        sc.close();



    }

}
