package Exercicios;

public class ex04 {
     /* 4- Faça um programa que receba o preço de um produto, calcule e mostre o novo preço, sabendo-se 
    que este sofreu um desconto de 10%. Por exemplo, se o produto custa R$ 100,00, o novo preço será 100 
    menos 10% de cem, que é 100 x 10 / 100. Essa conta é igual a 10, ficando o novo preço R$ 90,00. */

    public static void main (String[] args) {
        double produto, novo_produto;
        produto = 100;
        novo_produto = produto - (produto * 10 / 100);
        System.out.println("PREÇO ORIGINAL R$" + produto);
        System.out.println("NOVO PREÇO R$" + novo_produto);
    }
}
