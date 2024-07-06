package Exercicios;

public class ex03 {
     /* 3. Faça um programa que receba três notas de um estudante, calcule e 
    mostre a média aritmética entre elas (este exercício é similar ao exemplo 
    mostrado a neste capítulo, mas leva em consideração três notas e não quatro). */

    public static void main (String[] args) {
        double n1, n2, n3, media;
        n1 = 10;
        n2 = 8;
        n3 = 5;
        media = (n1 + n2 + n3) / 3;
        System.out.println("A media é:" + media);
    }
}
