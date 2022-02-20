package com.capgemini.diogo;

import com.capgemini.diogo.negocio.ValidadorSenha;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Diogo Concerva
 */

public class Questao02 {
    public static void main(String[] args) {
        String senha;
        boolean valida = false;
        ValidadorSenha validadorSenha = new ValidadorSenha();
        Scanner sc = new Scanner(System.in);

        while (!valida){
            System.out.print("Informe a senha: ");
            senha = sc.nextLine().trim();
            if (validadorSenha.temTamanhoMenorQueSeisCaracteres(senha)){
                System.out.println("Falta(m) " + (6 - senha.length()) + " caractere(s).");
            } else if (validadorSenha.validar(senha)){
                System.out.println("A Senha é segura.");
                valida = true;
            } else {
                System.out.println("A senha não é segura.");
            }
        }
    }
}
