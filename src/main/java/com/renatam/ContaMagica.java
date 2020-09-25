package com.renatam;

public class ContaMagica
{
    public static void main( String[] args)
    {
        ContaCorrente cc = new ContaCorrente("a", "b");

        cc.deposito(200000);
        printConta(cc);
        cc.deposito(200000);
        printConta(cc);
        cc.retirada(390000);
        printConta(cc);
        cc.retirada(1);
        printConta(cc);

    }
    
    private static void printConta(ContaCorrente cc) {  
        System.out.println("-----------------");
        System.out.println("Conta:");
        System.out.println(cc.getSaldo());
        System.out.println(cc.getCategoria());
        System.out.println("-----------------");
    }
}
