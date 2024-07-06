package Exercicios;

public class ex64 {
    public static void main(String[] args) {
        /*
         * 3. Crie um programa que preencha uma matriz 5 x 5 de números reais, 
         * calcule e mostre a soma dos elementos da diagonal secundária.
         */

         double matriz[][] = new double[5][5];
         int linha, coluna, soma=0;
         

         for (linha = 0; linha < 5; linha++) {
            for (coluna = 0; coluna < 5; coluna += 1) {
                System.out.print("[" + (linha+1) + "-" + (coluna+1) + "]");
                matriz[linha][coluna] = Integer.parseInt(System.console().readLine());
            }
         }

         for (int cont = 0; cont < matriz.length; cont++) {
            soma += matriz[cont][matriz.length - cont - 1];
         }
         System.out.printf("\nA SOMA DOS VALORES NA DIAGONAL SEGURANDRIA = %.1f\n", soma);

    }
}
