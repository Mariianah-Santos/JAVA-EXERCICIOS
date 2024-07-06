package Exercicios;

public class ex39 {
    public static void main(String[] args) {
        /*
         2. Escreva um programa em Java que mostre os números os números de 0 a 100 
         e seus correspondentes em binário.
         */

         String binario;
        int bin;
         for (bin = 0; bin <= 100; bin +=1) {
            binario = Integer.toString(bin, 2);
            System.out.println("EM BINARIO: [" + binario + "] NUMERO NORMAL: [" + bin + "]");
         }
    }
}
