package Exercicios;

public class ex40 {
     /*
     3. Escreva um programa em Java que leia um string contendo um número em binário e o mostre em decimal na tela.
     */

     public static void main(String[] args) {
        System.out.println("\nEste programa le um numero em binario e mostra seu valor em decimal.\n");
		
		System.out.print("Digite o numero em binario: ");
		String binario = System.console().readLine(); // Lemos o numero como String, já que o método Integer.parseInt() espera receber um valor desse tipo.
													  // Declaramos a variável "binario" aqui também. É uma prática comum declarar variáveis próximo de onde são usadas.
		int decimal = Integer.parseInt(binario, 2);
		System.out.printf("O numero em binario %s em decimal é %d\n", binario, decimal);
     }
}
