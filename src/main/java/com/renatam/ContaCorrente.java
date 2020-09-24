package com.renatam;

public class ContaCorrente {
    private final int LIMITE_CONTA_GOLD = 50000;
    private final int LIMITE_CONTA_PLATINUM = 200000;

    private String numeroConta;
    private String nomeCorrentista;
    private double saldo;
    private Categoria categoria;
    private double deposito;
    private double retirada;

    public ContaCorrente() {        
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }

    public Categoria getCategoria() {      
        return this.categoria;
    }

    public boolean deposito(double valor) {
        saldo += valor;

        this.checarUpgradeDeConta();

        return true;
    }

    public boolean retirada(double valor) {
        saldo -= valor;

        this.checarUpgradeDeConta();

        return true;
    }

    private void checarUpgradeDeConta() {
        if(this.getSaldo() < LIMITE_CONTA_GOLD) {
            this.categoria = Categoria.SILVER;
        } else if(this.getSaldo() >= LIMITE_CONTA_GOLD) {
            this.categoria = Categoria.GOLD;
        } else if(this.getSaldo() >= LIMITE_CONTA_PLATINUM) {
            this.categoria = Categoria.PLATINUM;
        }
    }
}