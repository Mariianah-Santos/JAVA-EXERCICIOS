package Exercicios;

public class ex68 {
     /*
     * Faça um programa em Java que calcule e mostre o resultado da série:
     *  
     *             &(elevadoa x) = 1 + x/1! + x(elevado a 2)/2! + x(elevado a 3)/3!... +
     * 
     *  O valor de x deve ser informado pelo usuário. A série deve ser calculada
        até o 15º termo. Utilize o método definido no exercício 6 para o cálculo
        do fatorial.
     */
    static int fatorial(int numero) {
		int fatorial = 1;
		for(int cont = 2; cont <= numero; cont++) {
			fatorial *= cont;
		}
		return fatorial;
	}
	
	public static void main(String[] args) {
		System.out.print("Valor de x: ");
		double x = Double.parseDouble(System.console().readLine());
		
		double ex = 1;
		for(int cont = 1; cont <= 15; cont++) {
			ex += Math.pow(x, cont) / fatorial(cont);
		}
		
		System.out.printf("e elevando a %f = %f\n", x, ex);
	}
}
