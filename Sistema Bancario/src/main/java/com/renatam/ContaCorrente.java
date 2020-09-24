package com.renatam;

public class ContaCorrente{
    private int numeroConta;
    private String nomeCorrentista;
    private double saldo;
    private Categoria categoria;
    private double deposito;
    private double retirada;

    public String getNumeroConta(){
        return numeroConta;
    }
    public String getNomeCorrentista(){
        return nomeCorrentista;
    }
    public double getSaldo(){       //implementar
        return saldo;
    }
    public Categoria getCategoria(){    //implementar
        return categoria;
    }
    public boolean deposito(double valor){  //implementar
        return deposito;
    }
    public boolean retirada(double valor){  //implementar
        return retirada;
    }

}