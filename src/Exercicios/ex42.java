package Exercicios;

import java.util.Scanner;

public class ex42 {
    /*
     5. Escreva um programa em Java que leia um número real qualquer e um número de casas decimais 
     (inteiro) e o arredonde o número real para o número de casas especificado.
      Por exemplo, caso o usuário informe o número 1,1379 e 2 casas decimais,
       o número seria arredondado para 1,14.
     */
    public static void main (String[] args ){
        double num;
        Scanner tcl = new Scanner (System.in);
        System.out.print("DIGITE UM NUMERO REAL COM 4 CASAS DECIMAS: ");
        num = tcl.nextDouble();
        num = Math.ceil(num);
        System.out.println(num);

        tcl.close();

    }
}
