package Exercicios;

public class ex50 {
    /*4. Faça um programa que leia dois vetores (A e B) com cinco posições. 
    Cada vetor deverá armazenar números inteiros. O programa deve, então, subtrair o primeiro elemento 
    de A do último de B, acumulando o valor; subtrair o segundo elemento de A do penúltimo de B, 
    acumulando o valor, e assim por diante. Ao final, mostre o resultado de todas as subtrações realizadas. */
    public static void main(String[] args) {
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		
		System.out.println("------------------------ VETOR A ------------------------");
		for(int cont = 0; cont < vetorA.length; cont++) {
			System.out.printf("Posicao %d: ", cont);
			vetorA[cont] = Integer.parseInt(System.console().readLine());
		}
		
		System.out.println("------------------------ VETOR B ------------------------");
		for(int cont = 0; cont < vetorB.length; cont++) {
			System.out.printf("Posicao %d: ", cont);
			vetorB[cont] = Integer.parseInt(System.console().readLine());
		}
		
		// Calcula subtracoes
		int[] resultados = new int[5];
		for(int cont = 0; cont < vetorA.length; cont++) {
			resultados[cont] = vetorA[cont] - vetorB[vetorB.length-cont-1];
		}
		
		System.out.println("----------------------- OPERACOES REALIZADAS -----------------------");
		for(int cont = 0; cont < resultados.length; cont++) {
			System.out.printf("%d - %d = %d\n", vetorA[cont], vetorB[vetorB.length-cont-1], resultados[cont]);
		}
	}
}
