package Exercicios;

public class ex32 {
     /*
     7. Faça um programa que apresente os quadrados dos números inteiros de 15 a 200.
     */
    public static void main(String[] args) {
        int num, quad;
        num = 15;
        while (num <= 200) {
            quad = num * num;
            System.out.println("A RAIZ QUADRADA DO NUMERO É: " + quad);
            num += 1;

        }
    }
}
