package Exercicios;

public class ex36 {
    public static void main (String[] args) {
        /*9. A série de Fibonacci é formada pela seguinte sequência: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ... etc, 
        onde o próximo número é igual a soma dos dois anteriores. 
        Escreva um programa que gere os dez primeiros números da série de Fibonacci, 
        utilizando estruturas repita e do...while. */

        int cont, penultimo, ultimo, aux;
		
		System.out.println("\nEste programa mostra os 10 primeiros numeros da sequencia de Fibonacci\n");
		
		penultimo = 0;
		ultimo = 1;
		cont = 0;
		do {
			System.out.println(ultimo);
			aux = ultimo;
			ultimo = ultimo + penultimo;
			penultimo = aux;
			cont = cont + 1;
		} while(cont < 10);
    }
}
