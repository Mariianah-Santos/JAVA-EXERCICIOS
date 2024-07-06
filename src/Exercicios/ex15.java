package Exercicios;

import java.util.Scanner;

public class ex15 {
     /*
     * 15. Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa temperatura em Fahrenheit. Sabe-se que
    𝐹= 9 ×𝐶5+32 

     */
    public static void main (String[] args) {
        double c, f;

        Scanner teclado = new Scanner(System.in);
        System.out.print("C: ");
        c = teclado.nextDouble();
        f = 9* c / 5 + 32;
        System.out.println("F: " + f);
        teclado.close();
    }
}
