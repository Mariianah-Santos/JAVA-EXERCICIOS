package Exercicios;

import java.util.Scanner;

public class ex28 {
        /*3. Crie um programa Java para exibir os quadrados de números digitados pelo usuário, 
    até que ele digite um número negativo. */
    public static void main (String[] args) {
        double num, n;
        Scanner tcl = new Scanner(System.in); 
        num = 1;
        
        while (num >= 0) {
            n = num * num;
            System.out.println("NUMERO QUADRADO É: " + n);
            System.out.print("Nº ");
            num = tcl.nextDouble();
           
        }
        tcl.close();
    }  
}
