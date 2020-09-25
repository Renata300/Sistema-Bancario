package com.renatam;

import static org.junit.Assert.*;

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
//     @Test
//     public void siverGold()
//     {
//         Assertions.assertEqual(50000, saldo, categoria);
//     }

//     @Test
//     public void goldPlatinum()
//     {
//         Assertions.assertEqual(200000, saldo, categoria);
//     }

//     @Test
//     public void platinumGold()
//     {
//         Assertions.assertEqual(90000, saldo, categoria);
//     }

//     @Test
//     public void goldSilver()
//     {
//         Assertions.assertEqual(24999, saldo, categoria);
//     }
}
