package Exercicios;

public class ex43 {
      /*6. Escreva um programa em Java que simule o lançamento de um dado, ou seja, sorteie um número entre 1 e 6. */
      public static void main(String[] args) {
        int num;
        num = (int) (1+Math.random()*6);
        System.out.println("O nunero sorteado é: " + num);
    }
}
