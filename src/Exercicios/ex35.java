package Exercicios;

import java.util.Scanner;

public class ex35 {
     public static void main (String[] args) {
        /*8. Faça um algoritmo e um programa, utilizando as estruturas repita e do..while que repita 
        a leitura de uma senha até que o usuário digite o número 1234. Após isso, mostrar a mensagem 
        “Senha correta, acesso liberado.” */

        int senha;
        Scanner tcl = new Scanner(System.in);
        do {
            System.out.print("DIGITE A SUA SENHA: ");
            senha = tcl.nextInt();

        } while (senha != 1234);
        System.out.println("SENHA CORRETA! ACESSO LIBERADO!!!");

        tcl.close();
    } 
}
