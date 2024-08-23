package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Conta;
import entidade.Conta_Corrente;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    	
        List<Conta> lista = new ArrayList<>();
        
        System.out.println("Qual seu nome");
        String nome = scn.nextLine();
        
        System.out.println("Qual o numero da sua conta");
        int numero = scn.nextInt();
        
        System.out.println("Voce quer utilizar: /n 1 Conta Corrente/n2 - Conta poupança");
        int conta = scn.nextInt();
        
        double limite;
        double saldo = 0;
        
        if(conta == 1) {
        	System.out.println("Qual o limite da conta: ");
        	limite = scn.nextDouble();
        	
        	Conta c = new Conta_Corrente(nome, conta, saldo);
        	list.add(d);
       }
        
        else {
        	Conta d = new contaPoupança(nome, conta, saldo);
        	lista.add(d);
        }
        System.out.println(lista);
    }
}