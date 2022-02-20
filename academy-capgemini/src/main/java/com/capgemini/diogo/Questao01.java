package com.capgemini.diogo;

import com.capgemini.diogo.negocio.Arvore;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Diogo Concerva
 */

public class Questao01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Informe um valor para entrada: ");
            int alturaEscada = scanner.nextInt();
            Arvore arvore = new Arvore();
            System.out.println(arvore.escrever(alturaEscada));
        }catch (InputMismatchException e){
            System.out.println("Valor digitado inválido.");
        }
    }
}
