package Exercicios;

import java.util.Scanner;

public class ex23 {
      /* 8. Faça um programa que leia três valores numéricos inteiros, 
    identifique e apresente o menor valor informado.*/

    public static void main (String[] args) {
             int n1, n2, n3;
        Scanner teclado = new Scanner(System.in);
        System.out.print("VALOR Nº1: ");
        n1 = teclado.nextInt();
        System.out.print("VALOR Nº2: ");
        n2 = teclado.nextInt();
        System.out.print("VALOR Nº3: ");
        n3 = teclado.nextInt();
        if ((n1 < n2) && (n1 < n3)) {
            System.out.println("NUMERO 1 É MENOR VALOR DIGITADO: " + n1);
        } else if ((n2 < n1) && (n2 < n3)) {
            System.out.println("NUMERO 2 É MENOR VALOR DIGITADO: " + n2);
        } else {
            System.out.println("NUMERO 3 É MENOR VALOR DIGITADO: " + n3);
        }
        teclado.close();
    }
    
}
