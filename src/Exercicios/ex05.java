package Exercicios;

public class ex05 {
      /* 5. Faça um programa que receba o salário base de um funcionário, 
calcule e mostre o salário a receber, sabendo-se que o funcionário tem 
gratificação de 5% sobre o salário base (que será acrescentado ao salário) 
e paga imposto de 7% sobre este salário (o que será descontado do salário).
 */

 public static void main (String[] agrs) {

    double salario, salario_gratificacao, salario_imposto;
    salario = 1380;
    salario_gratificacao = salario + (salario * 5 / 100);
    salario_imposto = salario_gratificacao - (salario_gratificacao * 7 / 100);
    System.out.println("Salario normal R$" + salario);
    System.out.println("Salario com 5% de gratificação R$" + salario_gratificacao);
    System.out.println("Salario com 7% de imposto R$" + salario_imposto);
    }
}
