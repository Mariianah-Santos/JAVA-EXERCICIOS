package Exercicios;

public class ex60 {
    public static void main(String[] args) {
        /*10. Faça um programa que receba um número inteiro maior que 1, 
        verifique se o número fornecido é primo ou não. 
        Um número é primo quando é divisível apenas por 1 e por ele mesmo. */
        int primo;

        System.out.print("Digite um nuemro  e descubra se ele é primo => ");
        primo = Integer.parseInt(System.console().readLine());
        if (primo % 1 == 0) {
            System.out.println(primo + " O NUMERO É PRIMO!!");
        } else {
            System.out.println(primo + " O NUMERO NÃO É PRIMO");
        }

    }
}
