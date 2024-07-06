package Exercicios;

import java.util.Scanner;

public class ex08 {
      /* 8. Faça um programa que calcule e mostre a área de um triângulo. 
    Sabe-se que: Área = (base x altura) / 2. A base e altura devem ser informadas pelo usuário. */

    public static void main (String[] args) {

        int area, base, altura;
        Scanner teclado = new Scanner(System.in);
        System.out.print("BASE: ");
        base = teclado.nextInt();
        System.out.print("ALTURA: ");
        altura = teclado.nextInt();
        area = (base * altura) / 2;
        System.out.println("A AREA:"+ area);

        teclado.close();
    }
}
