package Exercicios;

public class ex62 {
    public static void main (String[] args) {
        /*
         * 2. Faça um programa que preencha e mostre a média dos elementos 
         * da diagonal principal de uma matriz 10 x 10.
         */
        int matriz[][] = new int[10][10];
        int linha, coluna, soma = 0;
        double media;
        for (linha = 0; linha < 10; linha +=1) {
            for (coluna = 0; coluna < 10; coluna++) {
                System.out.print("[" + (linha+1) + "-" + (coluna+1) + "]");
                matriz[linha][coluna] = Integer.parseInt(System.console().readLine());
            }
        }
        for (int cont = 0; cont < matriz.length; cont++) {
            soma += matriz[cont][cont];
        }

            media = soma /(double) matriz.length;
            System.out.printf("\nMEDIA DOS VALORES NA DIAGONAL PRINCIPAL = %.1f\n", media);



    }
}
