package Exercicios;

public class ex49 {
      /*3. Faça um programa que receba o nome de oito clientes de uma videolocadora e armazene-os em um vetor. 
    Em um segundo vetor, armazene a quantidade de DVDs locados em 2017 por cada um dos oito clientes. 
    Sabe-se que, para cada dez locações, o cliente tem direito a uma locação grátis. 
    Faça um programa que mostre o nome de todos os clientes, com a quantidade de locações grátis a que ele 
    tem direito */
    public static void main (String[] args) {
        String nomes[] = new String[8];
        int dvd[] = new int[8];
        for(int cont = 0; cont < nomes.length; cont++) {
			System.out.printf("---------------- CLIENTE %02d ----------------\n", cont+1);
			System.out.print("Nome: ");
			nomes[cont] = System.console().readLine();
			System.out.print("Num. DVDs locados em 2017: ");
			dvd[cont] = Integer.parseInt(System.console().readLine());
		}
		
		System.out.println("\n------------------- RESULTADO -------------------");
		
		for(int cont = 0; cont < nomes.length; cont++) {
			int locacoesGratis = dvd[cont] / 10;
			System.out.printf("Cliente: %s (tem direito a %d locacoes gratis)\n", nomes[cont], locacoesGratis);
		}

    }
}
