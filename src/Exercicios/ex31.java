package Exercicios;

public class ex31 {
    public static void main(String[] args) {
		/*6. Para cada uma das mercadorias com que um armazém trabalha dispõe-se dos seguintes dados:
− o nome da mercadoria;
− o seu preço unitário;
− a quantidade total vendida no mês.
Elabore um programa para calcular o faturamento total mensal do armazém.
 O faturamento total do armazém será calculado somando-se o total faturado por cada mercadoria, 
 que é igual a quantidade vendida da mercadoria vezes o seu preço unitário. O número de mercadorias 
 comercializadas pelo armazém deve ser informado pelo usuário. */
 int numMercadorias, quantVendida, cont;
 String nome;
 double precoUnit, fatTotal;
 
 System.out.println("Este programa calcula o faturamento total de um armazem, somando o faturamento de cada produto.\n");
 
 System.out.print("Digite a quantidade de mercadorias: ");
 numMercadorias = Integer.parseInt(System.console().readLine());
 
 fatTotal = 0;
 cont = 0;
 while(cont < numMercadorias) {
	 System.out.printf("\n--- MERCADORIA %02d ---\n", cont+1);
	 System.out.print("Nome: ");
	 nome = System.console().readLine();
	 System.out.print("Preco Unitario: ");
	 precoUnit = Double.parseDouble(System.console().readLine());
	 System.out.print("Quantidade Vendida: ");
	 quantVendida = Integer.parseInt(System.console().readLine());
	 
	 fatTotal = fatTotal + precoUnit * quantVendida;
	 cont = cont + 1;
 }
 
 System.out.printf("\nFATURAMENTO TOTAL DO ARMAZEM = R$ %.2f\n", fatTotal);
 
	}
}
