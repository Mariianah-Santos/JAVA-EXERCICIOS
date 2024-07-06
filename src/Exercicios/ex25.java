package Exercicios;

import java.util.Scanner;

public class ex25 {
      /*
     * 10. A nota final de um estudante é calculada a partir de três notas atribuídas, respectivamente, 
     * a um trabalho de laboratório, a uma avaliação semestral e a um exame final. 
     * A média das três notas mencionadas obedece aos pesos a seguir:
    Nota Peso
    Trabalho de laboratório (2)
    Avaliação semestral (3)
    Exame final (5)
    Faça um programa que receba as três notas, calcule e mostre a média ponderada e o conceito que segue a tabela:
    Média Ponderada Conceito
    8,0 (inclusive) a 10,0 (inclusive) - A
    7,0 (inclusive) a 8,0 - B
    6,0 (inclusive) a 7,0 - C
    5,0 (inclusive) a 6,0 - D
    0,0 (inclusive) a 5,0 - E
     */
    public static void main(String[] args) {
        double media, n1, n2, n3;
        System.out.println(" trabalhoLab = 2 avaliacaoSem = 3 exameFinal = 5");
        Scanner tcl = new Scanner(System.in);
        System.out.print("TRABALHO DE LABORATORIO: ");
        n1 = tcl.nextDouble();
        System.out.print("AVALIAÇÃO SEMESTRAL: ");
        n2 = tcl.nextDouble();
        System.out.print("EXAME FINAL: ");
        n3 = tcl.nextDouble();
        media = (n1 + n2 + n3);
        if (media > 8) {
            System.out.println("NOTA [A] " + media);
        } else if (media >= 7) {
            System.out.println("NOTA [B] " + media);
        } else if (media >= 6) {
            System.out.println("NOTA [C] " + media);
        } else if (media >= 5) {
            System.out.println("NOTA [D] " + media);
        } else {
             System.out.println("NOTA [E] " + media);
        }
        tcl.close();
        
    }
}
