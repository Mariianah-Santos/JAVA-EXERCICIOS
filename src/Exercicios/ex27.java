package Exercicios;

import java.util.Scanner;

public class ex27 {
     /*2. Faça um programa que calcule o somatório, a soma dos quadrados e a média entre os n primeiros 
    números inteiros positivos */

    public static void main(String[] agrs) {
        int soma, numeros, n;
        double media;
        numeros = 0;
        soma = 0;
        media = 0;
        Scanner tcl = new Scanner(System.in);
        while (numeros < 4) {
            System.out.print("Nº ");
            n = tcl.nextInt();
            numeros = numeros + 1;
            soma = soma + n;
            media = soma / 4;
        }
        System.out.println("A SOMA DOS QUADRADOS: " + soma);
        System.out.println("A MEDIA: " + media);
        tcl.close();
    } 
}
