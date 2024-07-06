package Exercicios;

import java.util.Scanner;

public class ex10 {
     /* 10. Sabe-se que:
1 pé = 12 polegadas
1 jarda = 3 pés
1 milha = 1.760 jardas
Faça um programa que receba uma medida em pés , faça as conversões a seguir e mostre os resultados.
a. polegadas;
b. jardas;
c. milhas. */
    public static void main(String[] args) {
        double pes, polegada, milhas, jarda;
        Scanner teclado = new Scanner (System.in);
        System.out.print("PÉS: ");
        pes = teclado.nextDouble();
        polegada = pes * 12;
        jarda = pes / 3;
        milhas = jarda / 1760;

        System.out.println("POLEGADA: " + polegada);
        System.out.println("JARDA: "+jarda);
        System.out.println("MILHAS: "+ milhas);
       
        teclado.close();

    }
}
