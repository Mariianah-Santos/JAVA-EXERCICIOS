package Exercicios;

public class ex07 {
     /* 7. Faça um programa que receba três notas e seus respectivos pesos, 
    calcule e mostre a média ponderada dessas notas. Para calcular a média ponderada, 
    multiplique cada nota por seus respectivos pesos, some todos os resultados e 
    divida pela soma dos pesos. Por exemplo, se as notas forem 10, 5 e 6, e os pesos 1, 2 e 3, a 
    média final do estudante seria 10 x 1 + 5 x 2+ 3 x 6, que resulta em 10 + 10 + 18 = 38.
    Esse valor deve ser dividido pela soma dos pesos (6), resultando em 6,3. */
    public static void main (String[] args) {
        double n1, n2, n3, peso1, peso2, peso3, soma;
        
        n1 = 10;
        peso1 = 1;
        n2 = 5;
        peso2 = 2;
        n3 = 3;
        peso3 = 6;
        soma = (n1 * peso1) + (n2 * peso2) + (n3 * peso3);
        soma = soma / 6;
        System.out.println("A soma dos valores:" + soma );

        

    }
}
