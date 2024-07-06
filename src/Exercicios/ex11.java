package Exercicios;

import java.util.Scanner;

public class ex11 {
       /* 11. Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:
    a. a idade dessa pessoa em anos;
    b. a idade dessa pessoa em meses;
    c. a idade dessa pessoa em dias (considerando que cada ano possui 365 dias);
    d. a idade dessa pessoa em semanas (cada ano possui 52 semanas). */

    public static void main(String[] args) {
        int ano_nascimento, ano_atual, idade, idade_meses, idade_dias, idade_semana;
        Scanner teclado = new Scanner(System.in);
        System.out.print("ANO DE NASCIMENTO: ");
        ano_nascimento = teclado.nextInt();
        System.out.print("ANO ATUAL: ");
        ano_atual = teclado.nextInt();
        idade = ano_atual - ano_nascimento;
        idade_meses = idade * 12;
        idade_dias = idade * 365;
        idade_semana = idade * 52;
        System.out.println("IDADE: "+ idade);
        System.out.println("IDADE EM MESES:" + idade_meses);
        System.out.println("IDADE EM DIAS: " + idade_dias);
        System.out.println("IDADE EM SEMANAS: " + idade_semana);
        teclado.close();
    }
}
