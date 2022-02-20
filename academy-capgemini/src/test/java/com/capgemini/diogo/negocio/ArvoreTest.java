package com.capgemini.diogo.negocio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArvoreTest {
    private Arvore arvore;

    @Before
    public void iniciar(){
        arvore = new Arvore();
    }

    @Test
    public void testEscreverArvoreQuandoAlturaZero(){
        String resultado = arvore.escrever(0);
        Assert.assertEquals("", resultado);
    }

    @Test
    public void testEscreverArvoreQuandoAlturaTres(){
        String resultado = arvore.escrever(3);
        String valorEsperado = "  *\n" +
                " **\n" +
                "***\n";
        Assert.assertTrue(valorEsperado.equals(resultado));
    }
}
