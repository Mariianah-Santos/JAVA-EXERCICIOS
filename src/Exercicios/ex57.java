package Exercicios;

public class ex57 {
     /*6. Faça um programa que mostre os conceitos finais dos alunos 
    de uma turma de 75 pessoas, considerando a tabela a seguir. 
    Para isso, a nota final e o código do aluno deverão ser fornecidos pelo usuário.
    Ao final do programa, apresente a quantidade de alunos e a média de nota 
    alcançada para cada conceito. 
    Nota                                    Conceito
De 0,0 a 2,9                                    E

De 3,0 a 4,9                                    D

De 5,0 a 6,9
                                                C
De 7,0 a 8,9
                                                B
De 9,0 a 10,0
                                                A
 */
public static void main(String[] args) {

    double alunos[] = new double[75];
    double media = 0;
    for (int cont = 0; cont < alunos.length; cont += 1) {
        System.out.println("========== ALUNO " + (cont+1) + "==========");
        System.out.print("DIGITE A MEDIA DO ALUNO: ");
        alunos[cont] = Double.parseDouble(System.console().readLine());
        if (alunos[cont] > 0 || alunos[cont] < 2.9) {
            System.out.println("SUA NOTA É = > E");
        } else if (alunos[cont] > 3 || alunos[cont] < 4.9) {
            System.out.println("SUA NOTA É = > D");
        } else if(alunos[cont] > 5 || alunos[cont] < 6.9) {
            System.out.println("SUA NOTA É = > C");

        } else if(alunos[cont] > 7 || alunos[cont] < 8.9) {
            System.out.println("SUA NOTA É = > B");

        } else if (alunos[cont] > 9 || alunos[cont] < 10) {
            System.out.println("SUA NOTA É = > A");

        }
    }
}
}
