package Exercicios;

public class ex18 {
    public static void main (String[] args) {
        /*3. Construa um programa que leia três valores numéricos (representados pelas variáveis A, B e C) 
        e faça o cálculo do delta de uma equação de segundo grau, segundo a fórmula de Báskara. 
        O programa deve mostrar quantas raízes reais a equação possui 
        (delta < 0 – mostrar uma mensagem dizendo que a equação não possui raízes reais, delta > 0 – mostrar 
        que possui duas raízes reais, delta = 0 – mostrar que possui uma única raiz real). */

        int n, cont, soma, somaQuad;
		double media;
		
		System.out.println("Este programa calcula a soma, a soma dos quadrados e a media dos N primeiros numeros positivos.\n");
		System.out.print("Digite o valor de N: ");
		n = Integer.parseInt(System.console().readLine());
		
		soma = 0;
		somaQuad = 0;
		cont = 1;
		while(cont <= n) {
			soma = soma + cont;
			somaQuad = somaQuad + cont * cont;
			cont = cont + 1;
		}
		media = (double)soma / n; // O termo (double) antes de "soma" permite tratar o valor dessa variavel como double na divisao.
								  // Isso foi feito para que o resultado da divisao seja exato (divisao entre inteiros sempre gera um 
								  // valor inteiro.
		
		System.out.printf("SOMA DOS NUMEROS = %d\n", soma);
		System.out.printf("SOMA DOS QUADRADOS DOS NUMEROS = %d\n", somaQuad);
		System.out.printf("MEDIA DOS NUMEROS = %f\n", media);
    }
}
