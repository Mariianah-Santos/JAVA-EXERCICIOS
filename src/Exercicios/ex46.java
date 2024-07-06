package Exercicios;

public class ex46 {
    public static void main (String[] args) {

        /*Faça um programa que apresente o menu de opções a seguir, permita ao usuário escolher a opção desejada, 
        receba os dados necessários para executar a operação e mostre o resultado. Verifique a possibilidade de 
        opção inválida.

Menu de opções:

Imposto
Novo Salário
Classificação
Finalizar o programa

Na opção 1, receber o salário de um funcionário, calcular e mostrar o valor do imposto usando as seguintes regras:

Se o salário for menor do que R$ 1000,00, o percentual de imposto será de 5%.
Se o salário for um valor de R$ 1000,00 a R$ 3000,00, o percentual de imposto será de 10%.
Se o salário estiver acima de R$ 3000,00, o percentual de imposto será de 15%.

Na opção 2, receber o salário de um funcionário, calcular e mostrar o valor do novo salário usando as regras a seguir.

Para salários maiores do que R$ 4500,00, o aumento será de R$ 45,00.
Para salários de R$ 2250,00 até R$ 4500,00, o aumento será de R$ 150,00.
Para salários de R$ 1350,00 até R$ 2249,99, o aumento será de R$ 225,00.
Para salário menores que R$ 1350,00, o aumento será de R$ 300,00.

Na opção 3, receber o salário de um funcionário e mostrar sua classificação usando as seguintes regras:

Para salários até R$ 1500,00 a classificação será "Mal remunerado".
Para salários maiores que R$ 1500,00 a classificação será "Bem remunerado".

O programa que precisamos construir deve exibir o menu de opções enquanto o usuário não escolher
 a opção de finalizar o programa. O pseudocódigo abaixo mostra um algoritmo que repete a 
 exibição do menu de opções enquanto o usuário não finalizar o programa.  */

 double salario, imposto, novoSalrio;
 int opcao;
 do {
    System.out.println("========== MENU DE OPÇÃO ==========");
    System.out.println("[1] Imposto\r\n" + //
        "[2] Novo Salário\r\n" + //
        "[3] Classificação\r\n" + //
        "[4] Finalizar o programa");
    System.out.print("OPÇÃO DESEJADA -> ");
    opcao = Integer.parseInt(System.console().readLine());

        switch (opcao) {
               case 1:
                   System.out.println("========== SALARIO ==========");
                   System.out.print("DIGITE O SEU SALARIO R$");
                   salario = Double.parseDouble(System.console().readLine());
                   if (salario <= 1000) {
                       imposto = salario * 5 / 100;              
                       System.out.println("IMPOSTO A PAGAR R$" + imposto); 
                   } else if (salario > 1000 && salario < 3000) {
                       imposto = salario * 10 / 100;
                       System.out.println("IMPOSTO A PAGAR R$" + imposto); 
                   } else if (salario >= 3000) {
                       imposto = salario * 15 / 100;
                       System.out.println("IMPOSTO A PAGAR R$" + imposto); 
                   }
               break;
               case 2:
                   System.out.println("========== NOVO SALARIO ==========");
                   System.out.print("DIGITE SEU NOVO SALARIO R$");
                   salario = Double.parseDouble(System.console().readLine());
                   if (salario >= 4500) {
                       novoSalrio = salario + 45;
                       System.out.println("SEU NOVO SALARIO É R$" + novoSalrio);
                       System.out.println("SEU SALARIO ANTIGO É R$" + salario);
                   } else if (salario >= 2250 && salario < 4500) {
                       novoSalrio = salario + 150;
                       System.out.println("SEU NOVO SALARIO É R$" + novoSalrio);
                       System.out.println("SEU SALARIO ANTIGO É R$" + salario);
                   } else if (salario >= 1350 && salario < 2250) {
                       novoSalrio = salario + 225;
                       System.out.println("SEU NOVO SALARIO É R$" + novoSalrio);
                       System.out.println("SEU SALARIO ANTIGO É R$" + salario);
                   } else if (salario < 1350) {
                       novoSalrio = salario + 300;
                       System.out.println("SEU NOVO SALARIO É R$" + novoSalrio);
                       System.out.println("SEU SALARIO ANTIGO É R$" + salario);
                   }
               break;
               case 3:
                   System.out.println("========== CLASSIFICAÇÃO ==========");
                   System.out.print("digite seu salario R$");
                   salario = Double.parseDouble(System.console().readLine());
                   if (salario < 1500) {
                       System.out.println("VOCÊ É MAL REMUNERADO (PRÇA DEMISSÃO KK) R$" + salario);
                   } else if(salario > 1500) {
                       System.out.println("VOCÊ É BEM REMUNERADO :) R$" + salario);
                   }
               break;
               case 4:
                   System.out.println("OBRIGADA POR UTILIZAR O PROGRAMA");
               break;
            
               default:
                   System.out.println("POR FAVOR DIGITE UM NUMERO VALIDO [1, 2, 3, 4]");
               break;
            }
        } while (opcao != 4);
 
    }
}
