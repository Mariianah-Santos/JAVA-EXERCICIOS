package Exercicios;

import java.util.Scanner;

public class ex26 {
     public static void main(String[] args) {
        /* 1. Faça um programa que calcule a soma de dez números quaisquer fornecidos pelo usuário */
        int numero, soma, num;
        Scanner tcl = new Scanner(System.in);
        soma = 0;
        num = 0;
        while (num < 10) {
            System.out.print("Nº: ");
            numero = tcl.nextInt();
            soma = soma + numero;
            num = num + 1;
        }
        System.out.println("A soma dos numeros é: " + soma);
        tcl.close();
    }
}
