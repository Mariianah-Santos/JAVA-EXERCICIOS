package Exercicios;

import java.util.Scanner;

public class ex53 {
     /*
     * 2. Faça um programa que receba o tipo de ação, ou seja, 
     * uma letra qualquer a ser comercializada na bolsa de valores, 
     *o preço de compra e o preço de venda de cada ação e que calcule e mostre:
 a quantidade de ações com lucro superior a R$ 1.000,00;
 a quantidade de ações com lucro inferior a R$ 200,00.
Finalize com o tipo de ação ‘F’.
     */
    public static void main(String[] args) {
        String resp;
        Scanner tcl = new Scanner(System.in);
        
       
        do {
            System.out.print("QUAL LETRA DESEJA COMPRAR? ");
            resp = tcl.nextLine();
        } while (resp != "F") ;

        System.out.println("OBIRGADA POR USAR O PROGRAMA!!");
        tcl.close();
    }
}
