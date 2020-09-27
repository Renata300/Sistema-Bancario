package com.renatam;

public class ContaCorrente {
    private final int UPDATE_GOLD = 50000;
    private final int UPDATE_PLATINUM = 200000;
    private final int DOWNGRADE_SILVER = 25000;
    private final int DOWNGRADE_GOLD = 100000;

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
        if(valor < 0){
            return false;
        }else{
            if(categoria == Categoria.PLATINUM){
                saldo += valor+(2.5*valor)/100;
            }else if(categoria == Categoria.GOLD){
                saldo += valor+valor/100;
            }else{
                saldo += valor;
            }
        }

        this.checarUpgradeDeConta();

        return true;
    }

    public boolean retirada(double valor) {
        if(valor > this.getSaldo()) {
            return false;
        }

        saldo -= valor;

        this.checarDowngradeDeConta();

        return true;
    }

    private void checarUpgradeDeConta() {
        if(this.getSaldo() >= UPDATE_GOLD && this.getSaldo() < UPDATE_PLATINUM) {
            this.categoria = Categoria.GOLD;
        } else if(this.getSaldo() >= UPDATE_PLATINUM) {
            if(this.getCategoria() == Categoria.SILVER) {
                this.categoria = Categoria.GOLD;
            } else {
                this.categoria = Categoria.PLATINUM;
            }
        }
    }

    private void checarDowngradeDeConta() {
        if(this.getSaldo() < DOWNGRADE_SILVER) {
            if(this.getCategoria() == Categoria.PLATINUM) {
                this.categoria = Categoria.GOLD;
            } else {
                this.categoria = Categoria.SILVER;
            }
        } else if(this.getSaldo() <= DOWNGRADE_GOLD) {
            this.categoria = Categoria.GOLD;
        }
    }
}