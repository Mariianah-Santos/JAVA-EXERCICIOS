package Exercicios;

public class ex48 {
      /*2. Faça um programa que receba cinco números e mostre a saída a seguir: */
      public static void main(String[] args) {
        int soma = 0;
        int num[] = new int[5];
        for (int cont = 0; cont < num.length; cont += 1) {
            System.out.print("Nº " + (cont+1) + ": ");
            num[cont] = Integer.parseInt(System.console().readLine());
            soma += num[cont];
            
        }
        for(int cont = 0; cont < num.length; cont++) {
			if(cont > 0) // O primeiro valor não possui um sinal de + antes
				System.out.print("+ ");
				
			System.out.printf("%d ", num[cont]);
        }
        System.out.println(" = "  + soma);  
    }
}
