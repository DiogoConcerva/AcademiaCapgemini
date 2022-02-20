package com.capgemini.diogo.negocio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorSenha {

    /**
     * Metodo para validar senha informada
     * @param senha Valor digitado pelo usuario
     * @return Retorna se a senha e forte ou fraca
     */
    public boolean validar(String senha) {
        boolean digito = false;
        boolean maiusculo = false;
        boolean minusculo = false;
        Pattern pattern = Pattern.compile("[!@#$%^&*()+-]");
        Matcher matcher = pattern.matcher(senha);
        boolean caracterEspecial = matcher.find();

        for (char s : senha.toCharArray()) {
            if (s >= '0' && s <= '9'){
                digito = true;
            }else if (s >= 'A' && s <= 'Z'){
                maiusculo = true;
            }else if (s >= 'a' && s <= 'z'){
                minusculo = true;
            }
        }
        return digito && maiusculo && minusculo && caracterEspecial;
    }

    /**
     * Metodo para verificar se a senha e menor que seis caracteres
     * @param senha Recebe a senha digitada
     * @return Retorna se senha e menor que seis caracteres
     */
    public boolean temTamanhoMenorQueSeisCaracteres(String senha){
        return senha.length() < 6;
    }
}
