package Exercicios;

import java.util.Scanner;

public class ex52 {
     public static void main(String[] args) {
        /*
         * 1. Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os dados de idade,
         *  sexo (M ou F), e salário. Faça um programa que leia essas informações para cada habitante,
         *  calcule e mostre:
 a média dos salários do grupo;
 a maior e a menor idade do grupo;
 a quantidade de mulheres com salário até R$ 1500,00;
 a idade e o sexo da pessoa que possui o menor salário.
Finalize a entrada de dados ao ser digitada uma idade negativa.
         */
        /*Crinado as variaveis e vetores */
        double salario [] = new double[3];
        int idade[] = new int[3];
        String sexo[] = new String[3];
        int menor = 0, maior = 0, qtdMulher = 0;
        double idadeSexo = 0;
        double mediaSalario = 0;
        Scanner tcl = new Scanner(System.in);

        /* a crição do loops limitado */
       for (int cont = 0; cont < idade.length; cont += 1) {
            System.out.println("========= RELATÓRIO DA " + (cont+ 1) + " PESSOA ==========");
            System.out.print("IDADE: ");
            idade[cont] = Integer.parseInt(System.console().readLine());
            System.out.print("SEXO [M / F] ");
            sexo[cont] = tcl.nextLine();
            System.out.print("SALARIO R$");
            salario[cont] = Double.parseDouble(System.console().readLine());
            mediaSalario = salario[cont] / idade[cont];
        }
        /*fazendo as condições pedida no exercicio */
        for (int cont = 0; cont < idade.length; cont += 1) {
           if (idade[cont] > maior) {
               maior = idade[cont];
           } if (idade[cont] < menor) {
               menor = idade[cont];
           }
       }
       /*criando um loops par armazenar a quantidade de mulheres que tem ate 1500 */
       for (int cont = 0; cont < idade.length; cont += 1) {
            if (sexo[cont] == "F" && salario[cont] <= 1500) {
                qtdMulher += 1;
            } if (salario[cont] < idadeSexo) {
                idadeSexo = salario[cont];
            }
       }

      System.out.println("========== RELATORIO FINAL ==========");
      System.out.println("A MEDIA SALARIAL DO GRUPO É " + mediaSalario);
      System.out.println("A MAIOR IDADE É => " + maior);
      System.out.println("A MENOR IDADE É => " + menor);
      System.out.println("QUANTIDADE DE MULHERES QUE TEM SALARIO ATE R$1500 => " + qtdMulher);
      System.out.println("A IDADE E O MENOR SALARIO É: " + idadeSexo);
    }
}
