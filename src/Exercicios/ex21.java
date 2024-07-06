package Exercicios;

public class ex21 {
      /* 
    6. Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor.
    
    */
    public static void main (String[] args) {
        int ant, suc, num;
        ant = 0;
        suc = 0;
        System.out.print("Digite um numero e saiba o seu sucessor e antecessor: ");
        num = Integer.parseInt(System.console().readLine());
        suc = num + 1;
        ant = num - 1;
        System.out.println("NUMERO DIGITADO: " + num);
        System.out.println("SUCESSOR: " + suc);
        System.out.println("ANTECESSOR: " + ant);

        
        
    }
}
