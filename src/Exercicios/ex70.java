package Exercicios;

public class ex70 {
    static /*void siginica q esta usando o procedimento, ja que não precisa de um retorno*/void alteraNegativos(int[] vetor) {
		for(int cont = 0; cont < vetor.length; cont++) {
			if(vetor[cont] < 0)
				vetor[cont] = 0;
		}
	}
	
	public static void main(String[] args) {
		int[] numeros = new int[25];
		
		System.out.println("-------------- LEITURA DO VETOR --------------");
		for(int cont = 0; cont < numeros.length; cont++) {
			System.out.printf("vetor[%d]: ", cont);
			numeros[cont] = Integer.parseInt(System.console().readLine());
		}
		
		alteraNegativos(numeros);
		
		System.out.println("--------------- VETOR ALTERADO ---------------");
		for(int cont = 0; cont < numeros.length; cont++) {
			System.out.printf("vetor[%d] =  %d\n", cont, numeros[cont]);
		}
	}
}
