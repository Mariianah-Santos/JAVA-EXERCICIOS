package Exercicios;

public class ex67 {
      /*1. Escreva um programa em Java que calcule e escreva a soma dos
termos da série: 

    s = 100/0! + 99/1! + 98/2! + 97/3! + ... 80/20!

Defina um método para o cálculo do fatorial para ser usado neste
exercício.
    */

       /*static é uma função do java */ static /*long é um tipo primitivo*/ long /*fatorial é o nome da função*/ fatorial(/*int é o tipo primitivo de dado*/int /*numero é o nome da variavel*/numero) {
        long fatorial = 1;
        for(int cont = 2; cont <= numero; cont++) {
            fatorial *= cont;
        }
        return fatorial;
    }
    
    public static void main(String[] args) {
        double s = 0;
        for(int cont = 0; cont <= 20; cont++) {
            s += (100 + cont) / (double) fatorial(cont);
        }
        
        System.out.printf("S = %f\n", s);

    }
}
