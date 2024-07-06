package Exercicios;

public class ex51 {
    public static void main(String[] args) {
        /*
         * 5. Faça um programa que leia um vetor com 20 posições contendo números inteiros. 
         * Logo após, divida todos os seus elementos pelo maior valor do vetor e os armazene 
         * em outro vetor. Mostre, ao final, os valores armazenados em todas 
         * as posições do vetor após os cálculos.
         */
        
         /*criando as variaveis */
        int[] num = new int[5];
        int[] novoNum = new int[num.length];
        int maior = 0;

        /*criando um laço de repetição limitada e adicionado os valores nele */
        for (int cont = 0; cont < num.length; cont+=1) {
            System.out.print("Digite os numeros inteiros aqui -> ");
            num[cont] = Integer.parseInt(System.console().readLine());
            if (num[cont] > maior) {
                maior = num[cont];
            }
        }
        for (int cont = 0; cont < num.length; cont += 1) {
            novoNum[cont] = num[cont] / maior;

        }
        System.out.println("========== NOVOS VALORES ==========");
        for (int cont = 0; cont < num.length; cont += 1) {
            System.out.println( "POSIÇÃO: " + (cont+1) + "º -----> O VALOR CONTIDO É: " + novoNum[cont]);
            
        }
       

    }
}
