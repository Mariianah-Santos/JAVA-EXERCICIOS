package Exercicios;

import java.util.Scanner;

public class ex29 {
      public static void main(String[] args) {
        /*4. Faça um programa que receba várias idades,
         calcule e mostre a média das idades digitadas. Finalize digitando idade igual a zero. */

         Scanner tcl = new Scanner(System.in);
         int idade, soma = 0, qtdIdade = 0;
         double media;
         media = 0;
         idade = 1;
         while (idade != 0) {
            soma = soma + idade;
            qtdIdade += 1;
            System.out.print("IDADE: ");
            idade = tcl.nextInt();
         }
         media = (double)soma/qtdIdade;
         System.out.println("MEDIA DAS IDADES: " + media);
         tcl.close();
    }
}
