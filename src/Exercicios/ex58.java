package Exercicios;

public class ex58 {
    public static void main(String[] args) {
        /*7. Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
1. Média Aritmética
2. Média ponderada
3. Sair
Na opção 1, receber duas notas, calcular e mostrar a média aritmética deles.
Na opção 2, receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
Na opção 3, sair do programa.
Verifique a possibilidade de opção inválida, Neste caso, o programa deverá mostrar uma mensagem. */

        
        double n1, n2, n3, media;
        int op;
        do {

            System.out.println("========== MENU DE OPÇÃO ==========");
            System.out.println("1. Média Aritmética");
            System.out.println("2. Média ponderada");
            System.out.println("3. Sair");
            System.out.print("ESCOLHA: ");
            op = Integer.parseInt(System.console().readLine());
            switch (op) {
                case 1:
                    System.out.print("NOTA 1: ");
                    n1 = Double.parseDouble(System.console().readLine());
                    System.out.print("NOTA 2: ");
                    n2 = Double.parseDouble(System.console().readLine());
                    media = (n1 + n2) / 2;
                    System.out.println("A MEDIA É: " + media);
                break;
                case 2:
                    System.out.print("NOTA 1: ");
                    n1 = Double.parseDouble(System.console().readLine());
                    System.out.print("NOTA 2: ");
                    n2 = Double.parseDouble(System.console().readLine());
                    System.out.print("NOTA 3: ");
                    n3 = Double.parseDouble(System.console().readLine());
                    media = (n1 + n2 + n3) / 3;
                    System.out.println("A MEDIA É: " + media);
    
                break;
                case 3:
                    System.out.print("OBRIGDA POR USAR O PROGRAMA!!");
                break;
                default:
                    System.out.print("POR FAVOR DIGITE UMA OPÇÃO VÁLIDA!!"); 
                    
                break;
            }
        
        } while (op != 3);
    }
}
