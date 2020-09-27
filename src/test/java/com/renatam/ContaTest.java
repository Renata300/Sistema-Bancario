package com.renatam;

import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class ContaTest 
{
    private ContaCorrente cc;

    @Before
    public void initialize() {
        String nome = "Nome Usuario";
        String numeroConta = "123456";
        cc = new ContaCorrente(numeroConta, nome);
    }

    @Test
    public void newAccountShouldStartInSilverAndWithNoBalance()
    {
        var expectedBalance = 0.0;
        var expectedCategory = Categoria.SILVER;

        Assert.assertEquals(expectedBalance, cc.getSaldo(), 0.001);
    }

    @Test
    public void depositaRetira()
    {
        Assert.assertTrue(cc.deposito(500));
        Assert.assertTrue(cc.retirada(200));
    }
    
    @Test
    public void covertSilverToGold() //quando passa de silver para gold
    {

    }

    @Test
    public void convertGoldToPlatinum() //quando passa de gold para platinum
    {

    }

    @Test
    public void convertPlatinumToGold() //quando passa de platinum para gold
    {

    }

    @Test
    public void convertGoldToSilver() //quando passa de gold para silver
    {

    }

//     @Test
//     public void saldoInicialMedio()
//     {
//         Assertions.assertEqual(51000, saldo, categoria);
//     }
//     @Test
//     public void saldoInicialAlto()
//     {
//         Assertions.assertEqual(250000, saldo, categoria);
//     }
}
