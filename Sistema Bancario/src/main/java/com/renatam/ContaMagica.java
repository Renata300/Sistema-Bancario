package com.renatam;

import java.util.Scanner;

public class ContaMagica
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        double saldo = 500;

        ContaCorrente conta = new ContaCorrente();
        
        System.out.println("O que deseja fazer:");
        System.out.println("1- Numero da conta\n2- Nome do correntista\n3- Saldo\n4- Categoria\n5- Depositar\n6- Retirar");
        int escolha = new scanner.nextInt();

        switch(escolha){
            case 1:
            System.out.println(numeroConta);

            case 2:
            System.out.println(nomeCorrentista);

            case 3:
            System.out.println(saldo);

            case 4:
            System.out.println(categoria);

            case 5:
            System.out.println(deposito);

            case 6:
            System.out.println(retirar);

            default:
            System.out.println("Desculpe, nao ha essa opcao");
        }
        


    }
}
