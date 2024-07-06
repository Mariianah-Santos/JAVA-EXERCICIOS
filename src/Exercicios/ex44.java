package Exercicios;

import java.util.Scanner;

public class ex44 {
        public static void main(String[] args) {
        /*7. Faça um programa que recebe dois números e execute uma das operações listadas 
        a seguir, de acordo com a escolha do usuário. Se for digitada uma opção inválida, 
        mostre uma mensagem avisando sobre isso e termine a execução do programa. As opções são:
1. O primeiro número elevado ao segundo número.
2. Raiz quadrada de cada um dos números.
3. Raiz cúbica de cada um dos números. */
        int num1, num2, num, number;
        Scanner tcl = new Scanner(System.in);
        System.out.println("1. O primeiro número elevado ao segundo número.\r\n" + //
                "2. Raiz quadrada de cada um dos números.\r\n" + //
                "3. Raiz cúbica de cada um dos números.");
        System.out.println("=================================");
        System.out.print("DIGITE O PRIMEIRO NUMERO: ");
        num1 = tcl.nextInt();
        System.out.print("DIGITE O SEGUNDO NUMERO: ");
        num2 = tcl.nextInt();
        System.out.print("ESCOLHA UMA DAS OPÇÕES: ");
        num = tcl.nextInt();

        switch (num) {
            case 1:
                number = (int) Math.pow(num1, num2);
                System.out.println("RESULTADO: " + number);
            break;
            case 2:
                System.out.println("A RAIZ QUADRADA DO " + num1 + " E: " + (number = (int) Math.sqrt(num1)));
                System.out.println("A RAIZ QUADRADA DO " + num2 + " É: " + (number = (int) Math.sqrt(num2)));
            break;
            case 3:
                System.out.println("RAIZ CUBICA DO " + num1 + " É: " + (number = (int) Math.cbrt(num1)));
                System.out.println("RAIZ CUBICA DO " + num2 + " É: " + (number = (int) Math.cbrt(num2)));
            break;
            default:
                System.out.println("POR FAVOR DIGITE UM NUMERO VÁLIDO!! 1 A 3!!");
            break;
        }
        tcl.close();
    } 
}
