package Exercicios;

public class ex16 {
    public static void main (String[] args) {
        /* 1. Faça um programa que leia dois valores numéricos inteiros e apresente o resultado da 
        diferença do maior valor pelo menor valor. Se os valores forem iguais, o programa deve mostrar zero.*/ 

        int n1, n2, num;
        n1 = 10;
        n2 = 10;
        num = n1 - n2;
       if (n1 > n2) {
            System.out.println("NUMERO 1 [" + n1 + "] É MAIOR QUE O NUMERO 2 [" +  n2 + "]!! COM DIFERENÇA DE [" + num + "]");
            
       } else if (n2 > n1) {
            System.out.println("NUMERO 2 [" + n2 + "] É MAIOR QUE O NUMERO 1 [" +  n1 + "]!! COM DIFERENÇA DE [" + num + "]");
       } else {
        System.out.println("AMBOS SÃO NUMEROS IGUAIS: VALOR SERÁ IGUAL A ZERO [ " + n1 + "] ["+ n2 + "] [" + num + "]");
       }
    }
}
