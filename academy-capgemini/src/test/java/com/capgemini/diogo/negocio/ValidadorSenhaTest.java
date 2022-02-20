package com.capgemini.diogo.negocio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidadorSenhaTest {

    private ValidadorSenha validadorSenha;

    @Before
    public void iniciar(){
        validadorSenha = new ValidadorSenha();
    }

    @Test
    public void testSenhaQuandoTamanhoDeCaracteresMenorQueSeis(){
        Assert.assertTrue(validadorSenha.temTamanhoMenorQueSeisCaracteres("12345"));
    }

    @Test
    public void testSenhaQuandoTamanhoDeCaracteresMaiorQueSeis(){
        Assert.assertFalse(validadorSenha.temTamanhoMenorQueSeisCaracteres("123456"));
    }

    @Test
    public void testSenhaQuandoNaoTemCaracteresEspecial(){
        Assert.assertFalse(validadorSenha.validar("123456"));
    }

    @Test
    public void testSenhaQuandoNaoTemNumeros(){
        Assert.assertFalse(validadorSenha.validar("Ab)+dT"));
    }

    @Test
    public void testSenhaQuandoTemApenasCaracteresEspecial(){
        Assert.assertFalse(validadorSenha.validar(")+******"));
    }

    @Test
    public void testSenhaQuandoSenhaValida(){
        Assert.assertTrue(validadorSenha.validar("Ya+8hbT"));
    }
}
