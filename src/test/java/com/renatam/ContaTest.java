package com.renatam;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ContaTest 
{
    @Test
    public void saldoInicialBaixo()
    {
        Assertions.assertEqual(500, saldo, categoria);
    }
    @Test
    public void saldoInicialMedio()
    {
        Assertions.assertEqual(51000, saldo, categoria);
    }
    @Test
    public void saldoInicialAlto()
    {
        Assertions.assertEqual(250000, saldo, categoria);
    }
    @Test
    public void siverGold()
    {
        Assertions.assertEqual(50000, saldo, categoria);
    }

    @Test
    public void goldPlatinum()
    {
        Assertions.assertEqual(200000, saldo, categoria);
    }

    @Test
    public void platinumGold()
    {
        Assertions.assertEqual(90000, saldo, categoria);
    }

    @Test
    public void goldSilver()
    {
        Assertions.assertEqual(24999, saldo, categoria);
    }
}
