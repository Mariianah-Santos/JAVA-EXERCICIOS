package Exercicios;

public class ex17 {
    public static void main (String[] args) {
        /*2. Faça um programa que leia um valor numérico inteiro. O programa deve apresentar a mensagem 
        “O valor está na faixa permitida”, caso o valor informado esteja entre 1 e 9. 
        Se o valor estiver fora da faixa, o programa deve apresentar a mensagem 
        “O valor está fora da faixa permitida”. */
        System.out.println("FAIXA PERMITDA 1 A 9");
        int num;
        num = 7; /*Troque o numero para se encaixa no exercicio */
        if ((num == 1) || (num == 2) || (num == 3) || (num == 4) || (num == 5) || (num == 6) || (num == 7) || (num == 8) || (num == 9)) {
            System.out.println("ESTA NA FAIXA PERMITIDA: [" + num + "]");
        } else {
            System.out.println("NÃO ESTA NA FAIXA PERMITIDA [" + num + "]");
        }
    }
}
