package Exercicios;

public class ex66 {
    public static void main(String[] args) {
        /*5. Faça um programa que receba:
 as notas de 15 alunos em cinco provas diferentes e armazene-as em uma matriz 15 x 5;
 os nomes dos 15 alunos e armazene-os em um vetor de 15 posições.
O programa deverá calcular e mostrar, para cada aluno, o nome, a média aritmética 
d e a situação (as cinco provasaprovado, reprovado ou exame). 
Um estudante estará aprovado se atingiu média maior ou igual a sete, 
estará reprovado se atingiu média inferior a dois e em exame se atingiu 
média entre 2 e 7. */

        // criando as variaveis que vao armazenar
        double[][] notas = new double[3][5];
        String[] nome = new String[3];
        double media = 0;

        // recebendo os valores (nomes e notas)
        for (int alunos = 0; alunos < nome.length; alunos++) {
            System.out.printf("================= ALUNO %02d =================", alunos+1);
            System.out.println("");
            System.out.print("NOME: ");
            nome[alunos] = System.console().readLine();
            for (int provas = 0; provas < notas[alunos].length; provas += 1) {
                System.out.printf("NOTA %02d: ", provas +1);
                notas[alunos][provas] = Double.parseDouble(System.console().readLine());
            
            }
        }
        for (int alunos = 0; alunos < notas.length; alunos++) {
            System.out.printf("-------- ALUNO: %s\n --------", nome[alunos]);
            double somaNotas = 0;
            for (int provas = 0; provas < notas[alunos].length; provas++) {
                somaNotas += notas[alunos][provas];
            }
            media = somaNotas / notas[alunos].length;
            System.out.printf("MEDIA => %.1f", media);
            if (media >= 7) {
                System.out.println(" => APROVADO");
            } else if (media >=2 && media < 7) {
                System.out.println(" => RECUPERAÇÃO");
            } else {
                System.out.println(" => REPROVADO");
            }
            System.out.println();
         }

    }
}
