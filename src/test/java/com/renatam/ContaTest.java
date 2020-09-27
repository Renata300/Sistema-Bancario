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
        var expectedName = "Nome Usuario";
        var expectedCountNumber = "123456";

        Assert.assertEquals(expectedBalance, cc.getSaldo(), 0.001);
        Assert.assertEquals(expectedCategory, cc.getCategoria());
        Assert.assertEquals(expectedCountNumber, cc.getNumeroConta());
        Assert.assertEquals(expectedName, cc.getNomeCorrentista());
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
        cc.deposito(50000);
        var categoriaEsperada = Categoria.GOLD;
        var categoriaAtual = cc.getCategoria();

        Assert.assertEquals(categoriaEsperada, categoriaAtual);
    }

    @Test
    public void notCovertSilverToPlatinum() //vericar se pula
    {
        cc.deposito(201000);
        var categoriaEsperada = Categoria.GOLD;
        var categoriaAtual = cc.getCategoria();

        Assert.assertEquals(categoriaEsperada, categoriaAtual);
    }

    @Test
    public void convertGoldToPlatinum() //quando passa de gold para platinum
    {
        cc.deposito(50000);
        cc.deposito(150000);
        var categoriaEsperada = Categoria.PLATINUM;
        var categoriaAtual = cc.getCategoria();

        Assert.assertEquals(categoriaEsperada, categoriaAtual);
    }

    @Test
    public void convertPlatinumToGold() //quando passa de platinum para gold
    {
        cc.deposito(50000);
        cc.deposito(150000);
        cc.retirada(120000);
        var categoriaEsperada = Categoria.GOLD;
        var categoriaAtual = cc.getCategoria();

        Assert.assertEquals(categoriaEsperada, categoriaAtual);
    }

    @Test
    public void notConvertPlatinumToSilver() //verificar se pula
    {
        cc.deposito(50000);
        cc.deposito(150000);
        cc.retirada(190000);
        var categoriaEsperada = Categoria.GOLD;
        var categoriaAtual = cc.getCategoria();

        Assert.assertEquals(categoriaEsperada, categoriaAtual);
    }

    @Test
    public void convertGoldToSilver() //quando passa de gold para silver
    {
        cc.deposito(50000);
        cc.retirada(25001);
        var categoriaEsperada = Categoria.SILVER;
        var categoriaAtual = cc.getCategoria();

        Assert.assertEquals(categoriaEsperada, categoriaAtual);
    }

    @Test
    public void retiraMaisDoQuePossui()
    {
        cc.deposito(50000);
        var resultadoRetirada = cc.retirada(100000);

        Assert.assertFalse(resultadoRetirada);
    }
}
