package Exercicios;

import java.util.Scanner;

public class ex14 {
     /* 14. Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. Faça um programa que receba o valor do salário mínimo e a quantidade de quilowatts consumida por uma residência, calcule e mostre:
        a. o valor de cada quilowatt;
        b. o valor a ser pago por essa residência;
        c. o valor a ser pago com desconto de 15%. */
    public static void main (String[] args) {
        double salario, quantKW, valorKW, valorAPagar, desconto, valorComDesc;
        Scanner teclado = new Scanner(System.in);
        System.out.print("SALARIO R$");
        salario = teclado.nextDouble();
        System.out.print("QUANTIDADE EM QUILOWATT: ");
        quantKW = teclado.nextDouble();
        valorKW = salario / 5;
        valorAPagar = valorKW * quantKW;
        desconto = valorAPagar * 15 / 100;
        valorComDesc = valorAPagar - desconto;
        System.out.println("VALOR EM QUILOWATT R$" + valorKW);
        System.out.println("VALOR A PAGAR R$" + valorAPagar);
        System.out.println("VALOR COM DESCONTO R$" + valorComDesc);

        teclado.close();
    }
}
