package Exercicios;

public class ex47 {
    public static void main (String[] args) {
        /*
         1. Faça um programa que preencha três vetores com dez posições cada um: o primeiro vetor, 
         com os nomes de dez produtos; o segundo vetor, com os códigos dos dez produtos; e o terceiro vetor, 
         com os preços dos produtos. Mostre um relatório apenas com o nome, o código, o preço e o novo preço 
         dos produtos que sofrerão aumento. Sabe-se que os produtos que sofrerão aumento são aqueles que 
         possuem código par ou preço superior a R$ 1.000,00. Sabe-se ainda que, para os produtos que 
         satisfizerem às duas condições anteriores, código e preço, o aumento será de 20%; para aqueles 
         que satisfizerem apenas à condição do código, o aumento será de 15%; e para aqueles que 
         satisfizerem apenas à condição de preço, o aumento será de 10%.
         */
        /*criando os vetores e as variaveis */
        String nome[] = new String[3];
        int[] codigo = new int[3];
        double preco[] = new double[3];
        double precoNovo = 0;

        /*inserir os dados e armazena-los */
        for (int cont = 0; cont < nome.length; cont += 1) {
            System.out.printf("---------------- PRODUTO %02d ----------------\n", cont+1);
            System.out.print(" NOME: ");
            nome[cont] = System.console().readLine();
            System.out.print(" CÓDIGO: ");
            codigo[cont] = Integer.parseInt(System.console().readLine());
            System.out.print(" PREÇO R$ ");
            preco[cont] = Double.parseDouble(System.console().readLine());
        }
        System.out.println("========== RELATÓRIO ==========");
        for (int cont = 0; cont < nome.length; cont +=1) {
            if(codigo[cont] % 2 == 0 && preco[cont] > 1000) {
                precoNovo = preco[cont] + (preco[cont * 20 / 100]);
            } else if (codigo[cont] % 2 == 0) {
                precoNovo = preco[cont] + (preco[cont] * 15 / 100);
            } else if (preco[cont] > 1000) {
              precoNovo = preco[cont] + (preco[cont] * 10 / 100);
            }
            if (precoNovo > 0) {
                double novoPreco = preco[cont] + precoNovo;
                System.out.printf("\nProduto: %d\n", cont+1);
                System.out.printf("Nome: %s\n", nome[cont]);
                System.out.printf("Codigo: %d\n", codigo[cont]);
                System.out.printf("Preco: R$ %.2f\n", preco[cont]);
                System.out.printf("Novo Preco: R$ %.2f\n", precoNovo);
            }
        }

    }
}
