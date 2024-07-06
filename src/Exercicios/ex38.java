package Exercicios;

public class ex38 {
       /*1. Escreva um programa em Java que calcule e mostre a raiz quadrada dos números de 1 a 100. 
        Em cada linha de saída, o programa deve mostrar o número e sua raiz quadrada. */

            public static void main(String[] args) {
                for (int ralz = 1; ralz <= 100; ralz++) {
                    int raizQ = ralz * ralz;
                    System.out.println("A RAIZ QUADRADA DE " + ralz + " É: " + raizQ);
                }
            }
        
        
        
        
        
       

    //     for (raiz = 1; raiz <= 100; raiz += 1) {
    //         raizQ = Math.sqrt(raiz);
    //         System.out.println(" NUMERO: " + raiz + "A RAIZ QUADRADA DO NUMERO É: " + raizQ);
    //     }
        
    //          int raiz, raizQ;
    //         for (raiz = 1; raiz <= 100; raiz += 1) {
    //             raizQ = (int) Math.sqrt(raiz);
    //             System.out.println(" NUMERO: " + raiz + "A RAIZ QUADRADA DO NUMERO É: " + raizQ);
    // }
}
