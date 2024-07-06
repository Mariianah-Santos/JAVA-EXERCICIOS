package Exercicios;

public class ex71 {
    static int mmc(int a, int b) {
		int result = Math.max(a,b);
		while(result % a != 0 || result % b != 0) {
			result += Math.max(a,b);
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("---------------- FRACAO 1 ----------------");
		System.out.print("Numerador: ");
		int n1 = Integer.parseInt(System.console().readLine());
		System.out.print("Denominador: ");
		int d1 = Integer.parseInt(System.console().readLine());
		
		System.out.println("---------------- FRACAO 2 ----------------");
		System.out.print("Numerador: ");
		int n2 = Integer.parseInt(System.console().readLine());
		System.out.print("Denominador: ");
		int d2 = Integer.parseInt(System.console().readLine());
		
		int dr = mmc(d1, d2);
		int nr = dr/d1*n1 + dr/d2*n2;
		
		System.out.printf("\nSOMA DAS FRACOES = %d/%d\n", nr, dr);
	}
}
