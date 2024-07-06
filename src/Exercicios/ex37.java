package Exercicios;

public class ex37 {
    public static void main(String[] args) {
        /*10. Faça um programa que mostre o menu de opções a seguir, receba a opção digitada pelo usuário 
        e os dados necessários para executar cada operação. Note que dependendo da opção escolhida pelo usuário,
         um conjunto de instruções diferente será executado. DICA: utilize as estruturas escolha e 
         switch para executar conjuntos de instruções diferentes, dependendo da opção escolhida pelo usuário.
Menu de opções:
1. Somar dois números.
2. Número ao quadrado.
Digite a opção desejada */
        int opcao, n1, n2, soma, quad;
        System.out.println("Escolha um das opções abaixo!!");
        System.out.print("Menu de opções:\r\n" + //
                "1. Somar dois números.\r\n" + //
                "2. Número ao quadrado.\r\n" + //
                "Digite a opção desejada");
        
        opcao = Integer.parseInt(System.console().readLine());
        switch (opcao) {
        
                case 1:
                    System.out.print("Digite o primerio numero: ");
                    n1 = Integer.parseInt(System.console().readLine());
                    System.out.print("Digite o segundo numero: ");
                    n2 = Integer.parseInt(System.console().readLine());
                    soma = n1 + n2;
                    System.out.println("A soma dos numeros é: " + soma);
                break;
                case 2:
                    System.out.print("Digite o numero para saber a raiz quadrada: ");
                    n1 = Integer.parseInt(System.console().readLine());
                    quad = n1 * n1;
                    System.out.println("A RAIZ DO NUMERO: " + n1 + " É: " + quad);
                break;
                default:
                    System.out.println("POR FAVOR ESCOLHA UMA DAS OPÇÕES ACIMA!!");
                break;
        }
        
        


    }
}
