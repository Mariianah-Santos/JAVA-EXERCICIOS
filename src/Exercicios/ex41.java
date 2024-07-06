package Exercicios;

public class ex41 {
    /*
     4. Escreva um programa em Java que calcule as raízes de uma equação de segundo grau utilizando 
     a fórmula de Báskara. A equação de segundo grau é uma equação no formato 
     Ax2 + Bx + C. O usuário deve informar os valores para A, B e C.
     */
    public static void main(String[] args) {
        double a, b, c, x, delta, x1, x2;
        System.out.print("A: ");
        a = Double.parseDouble(System.console().readLine());
        System.out.print("B: ");
        b = Double.parseDouble(System.console().readLine());
        System.out.print("C: ");
        c = Double.parseDouble(System.console().readLine());
        delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Nao foi possivel calcular as raizes da equacao, pois ela nao possui raizes reais.");
        }
        if (delta == 0) {
            x = - b / (2 * a);
            System.out.printf("A equacao possui uma raiz real = %f.\n", x);

        }
        if (delta > 0) {
            x1 = (- b + Math.sqrt(delta)) / (2 * a);
			x2 = (- b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("A equacao possui duas raizes reais = %f e %f.\n", x1, x2);
        }
    }
}
