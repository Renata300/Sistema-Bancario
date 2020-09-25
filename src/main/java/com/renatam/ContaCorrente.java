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

    public ContaCorrente(String numeroConta, String nomeCorrentista) {
        this.categoria = Categoria.SILVER;
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public String getNomeCorrentista() {
        return this.nomeCorrentista;
    }

    public double getSaldo() {
        return this.saldo;
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
        if(valor > this.getSaldo()) {
            return false;
        }

        saldo -= valor;

        this.checarUpgradeDeConta();

        return true;
    }

    private void checarUpgradeDeConta() {
        if(this.getSaldo() < LIMITE_CONTA_GOLD) {
            if(this.getCategoria() == Categoria.PLATINUM) {
                this.categoria = Categoria.GOLD;
            } else {
                this.categoria = Categoria.SILVER;
            }
        } else if(this.getSaldo() >= LIMITE_CONTA_GOLD && this.getSaldo() < LIMITE_CONTA_PLATINUM) {
            this.categoria = Categoria.GOLD;
        } else if(this.getSaldo() >= LIMITE_CONTA_PLATINUM) {
            if(this.getCategoria() == Categoria.SILVER) {
                this.categoria = Categoria.GOLD;
            } else {
                this.categoria = Categoria.PLATINUM;
            }
        }
    }
}