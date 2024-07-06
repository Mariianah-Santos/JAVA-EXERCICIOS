package Exercicios;

public class ex61 {
    public static void main(String[] args) {
        /*
         * 1. Elabore um programa que preencha uma matriz 6 x 4, calcule e armazene o maior elemento de 
         * cada linha e multiplique cada linha por seu respectivo maior elemento. Mostre a matriz resultante.
         */

         /*criando as variaveis sendo vetores em matrizes */
        int matriz[][] = new int[6/*linha */][4 /*coluna */];
        int somaLinha[] = new int[6];
        int linha, coluna;
        for (linha = 0; linha < 6; linha+=1) {
            for (coluna = 0; coluna < 4; coluna +=1) {
                System.out.print("[" + (linha+1) + "-" + (coluna + 1) + "] => ");
                matriz[linha][coluna] = Integer.parseInt(System.console().readLine());
            }
        }
        for (linha = 0; linha < 6; linha +=1) {
            somaLinha[linha] = 0;
            for (coluna = 0; coluna < 4; coluna += 1) {
                somaLinha[linha] += matriz[linha][coluna];
            }
        }
        for (linha = 0; linha < 6; linha += 1) {
            for (coluna = 0; coluna <4; coluna +=1) {
                matriz[linha][coluna] *= matriz[linha][coluna];
            }
        }
        for (linha = 0; linha < 6; linha++) {
            for (coluna =0; coluna <4; coluna+=1) {
                System.out.println("MATRIZES: " + linha + coluna + matriz[linha][coluna]);
            }
        }
    }
}

// OU

// public class ex61 {
// 	public static void main(String[] args) {
// 		int[][] matriz = new int[6][4];
		
// 		// Lê valores para cada elemento da matriz.
// 		for(int linha = 0; linha < matriz.length; linha++) { // É possível usar o atributo "length" para obter o número de linhas da matriz.
// 			for(int coluna = 0; coluna < matriz[linha].length; coluna++) { // Cada linha pode ser vista como um vetor e possui seu próprio atributo "length".
// 				System.out.printf("matriz[%d][%d]: ", linha, coluna);
// 				matriz[linha][coluna] = Integer.parseInt(System.console().readLine());
// 			}
// 		}
		
// 		// Calcula e armazena os maiores elementos de cada linha.
// 		int[] maiores = new int[matriz.length];
// 		for(int linha = 0; linha < matriz.length; linha++) {
// 			maiores[linha] = matriz[linha][0];
// 			for(int coluna = 1; coluna < matriz[linha].length; coluna++) {
// 				if(matriz[linha][coluna] > maiores[linha])
// 					maiores[linha] = matriz[linha][coluna];
// 			}
// 		}
		
// 		// Multiplica cada linha por seu respectivo maior elemento.
// 		for(int linha = 0; linha < matriz.length; linha++) {
// 			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
// 				matriz[linha][coluna] *= maiores[linha];
// 			}
// 		}
		
// 		// Mostra a matriz resultante.
// 		System.out.println("\n---------------- NOVA MATRIZ ----------------");
// 		for(int linha = 0; linha < matriz.length; linha++) {
// 			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
// 				System.out.printf("%5d ", matriz[linha][coluna]);
// 			}
// 			System.out.println();
// 		}
// 	}
// }

