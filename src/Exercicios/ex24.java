package Exercicios;

import java.util.Scanner;

public class ex24 {
     /*9. Uma empresa decide dar um aumento de 30% aos funcionários cujo salário é inferior a 5000. 
    Escreva um programa que possa ser utilizado para efetuar o cálculo do salário reajustado de um funcionário, 
    a partir do valor do salário informado pelo usuário. */

    public static void main(String[] args) {
        double salario, novoSal;
        Scanner tcl = new Scanner(System.in);
        System.out.print("SALARIO R$");
        salario = tcl.nextDouble();
        novoSal = salario + (salario * 30/ 100);
        if (salario < 5000) {
            System.out.println("VOCE TEVE UM REAJUSTE DE SALARIO DE 30% (SALARIO ANTIGO R$)" + salario + "(SALARIO ATUAL R$)" + novoSal);
        } else {
            System.out.println("VOCE JA GANHA O SUFICIENTE X) R$" + salario);
        }
        tcl.close();
    }
}
