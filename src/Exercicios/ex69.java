package Exercicios;

public class ex69 {
    static boolean ehPrimo(int numero) {
		for(int cont = 2; cont < numero; cont++) {
			if(numero % cont == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		for(int numero = 1; numero <= 100; numero++) {
			if(ehPrimo(numero))
				System.out.println(numero);
		}
	}
}
