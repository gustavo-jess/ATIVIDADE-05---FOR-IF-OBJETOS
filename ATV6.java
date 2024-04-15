package Atividade06;

public class ContaBancaria {
    private double saldo;
    private String nmrConta;

    public ContaBancaria(String nmrConta) {
        this.nmrConta = nmrConta;
        this.saldo = 0.0;
    }
    public void depositar(double depositarValor){
       if(depositarValor > 0){
           saldo += depositarValor;
           System.out.println("Você obteve sucesso no deposito de: R$" + depositarValor );
       }else {
           System.out.println("Você não obteve sucesso no deposito de: R$" + depositarValor);
       }
    }

    public void sacar(double sacarValor){
        if(sacarValor > 0){
        }else {
            System.out.println("Você não possui saldo suficiente para realizar o saque");
        }if(saldo >= sacarValor){
            saldo -= sacarValor;
            System.out.println("Você obteve sucesso no saque de: R$" + sacarValor);
        }else {
            System.out.println("Saldo insuficiente para sacar o valor de: R$" + sacarValor);
        }
    }
    public double consultaSaldo(){
        return saldo;
    }

}




package Atividade06;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     ContaBancaria minhaConta = new ContaBancaria("4404");

     System.out.println("Qaunto o(a) senhor(a) deseja depositar? ");
     double valorDeposito = scanner.nextDouble();
     minhaConta.depositar(valorDeposito);

        System.out.println("Quanto o(a) senhor(a) deseja sacar? ");
        double valorSaque = scanner.nextDouble();
        minhaConta.sacar(valorSaque);

        double saldoAtual = minhaConta.consultaSaldo();
        System.out.println("O saldo atual da sua conta é: R$" + saldoAtual);

    }
}
