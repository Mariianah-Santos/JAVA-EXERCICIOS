package Exercicios;

import java.util.Scanner;

public class ex13 {
     /* 13. Faça um programa que receba o número de horas trabalhadas e o valor do salário mínimo, calcule e mostre o salário a receber seguindo estas regras:
        a. a hora trabalhada vale um décimo do salário mínimo;
        b. o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;
        c. o imposto equivale a 3% do salário bruto;
        d. o salário a receber equivale ao salário bruto menos o imposto. */
    public static void main (String[] args) {
        double numHoraTrab, salMin, valorHoraTrab, salBruto, imposto, salReceber;
        Scanner teclado = new Scanner(System.in);
        System.out.print("HORAS TRABALHADAS: ");
        numHoraTrab = teclado.nextDouble();
        System.out.print("SALARIO R$");
        salMin = teclado.nextDouble();
        valorHoraTrab = salMin / 10;
        salBruto = numHoraTrab * valorHoraTrab;
        imposto = salBruto * 3 / 100;
        salReceber = salBruto - imposto;
        System.out.println("SALARIO A RECEBER R$" + salReceber);
        teclado.close();


    }
}
