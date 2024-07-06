package Exercicios;

public class ex19 {
     /*4. Construa um programa que leia três valores para os lados de um triângulo (A, B e C). 
    O programa deve verificar se os lados fornecidos formam realmente um triângulo.
     Em caso positivo, deve mostrar a mensagem “Os lados formam um triângulo” e caso contrário 
     “Os valores informados não podem formar um triângulo”. 
     Para que três valores de lados formem um triângulo, cada par de lados somados não pode ser menor ou igual ao 
     terceiro lado. */

     public static void main (String[] args) {
        double a, b, c;
      
        System.out.print("Digite a medida da letra A: ");
        a = Double.parseDouble(System.console().readLine());
        System.out.print("Digite a medida da letra B: ");
        b = Double.parseDouble(System.console().readLine());
        System.out.print("Digite a medida da letra C: ");
        c = Double.parseDouble(System.console().readLine());
        if (a + b > c && a + c > b && b + c > a){
            System.out.println("FORMAM UM TRIANGULO");
        } else {
            System.out.println("NÃO FORMAM UM TRIANGULO");
        }

     }
}
