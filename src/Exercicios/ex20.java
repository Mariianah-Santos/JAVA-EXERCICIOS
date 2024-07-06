package Exercicios;

public class ex20 {
     /*5. Desenvolva um programa que leia quatro valores numéricos 
    inteiros e mostre os valores que são divisíveis por 2 e 3. */
    public static void main (String[] args) {
        int n1, n2, n3, n4;
        n1 = Integer.parseInt(System.console().readLine());
        n2 = Integer.parseInt(System.console().readLine());
        n3 = Integer.parseInt(System.console().readLine());
        n4 = Integer.parseInt(System.console().readLine());
        if (n1 % 2 == 0 && n1 % 3 == 0) {
            System.out.println("OS NUMEROS SAO DIVISIVEIS POR 2 E 3");
        } if (n2 % 2 == 0 && n2 % 3 == 0) {
              System.out.println("OS NUMEROS SAO DIVISIVEIS POR 2 E 3");
        } if (n3 % 2 == 0 && n3 % 3 == 0) {
            System.out.println("O numero é divisiveis por 2 e 3");
        } if (n4 % 2 == 0 && n4 % 3 == 0) {
            System.out.println("O numero é divisiveis por 2 e 3");
        }
    }
}
