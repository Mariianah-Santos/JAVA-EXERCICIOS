package Exercicios;

import java.util.Scanner;

public class ex12 {
      /* 12. O custo ao consumidor de um carro novo é a soma do preço de fábrica com o percentual de 
    lucro do distribuidor e dos impostos aplicados ao preço de fábrica. 
    Faça um programa que receba o preço de fábrica de um veículo, o percentual de lucro do distribuidor 
    e o percentual de impostos, calcule e mostre:

    a. o valor correspondente ao lucro do distribuidor;
    b. o valor correspondente aos impostos;
    c. o preço final do produto. 
    */

    public static void main(String[] args) {
        double precoFinal, precoFabrica, percentualLucro, percImpo, lucroDist, valorImpo;
        Scanner teclado = new Scanner(System.in);
        System.out.print("PREÇO DE FABRICA R$");
        precoFabrica = teclado.nextDouble();
        System.out.print("PERCENTUAL DE LUCRO R$");
        percentualLucro = teclado.nextDouble();
        System.out.print("PERCENTUAL DE IMPSOTO R$");
        percImpo = teclado.nextDouble();
        lucroDist = precoFabrica * percentualLucro / 100;
        valorImpo = precoFabrica * percImpo / 100;
        precoFinal = precoFabrica + lucroDist + valorImpo;
        System.out.println("LUCROS DISTRIBUDOR R$ " + lucroDist);
        System.out.println("VALOR IMPOSTO R$" + valorImpo);
        System.out.println("PREÇO FINAL R$" + precoFinal);

        teclado.close();
    }
}
