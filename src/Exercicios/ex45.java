package Exercicios;

import java.util.Scanner;

public class ex45 {
     public static void main (String[] args) {
        /*Nosso cinema possui capacidade para 100 pessoas e está sempre com ocupação total. 
        Certo dia, cada espectador respondeu a um questionário, no qual constava sua idade 
        e sua opinião em relação ao filme, segundo as seguintes notas:
                Nota                      Significado

                A                             Ótimo

                B                             Bom

                C                             Regular

                D                             Ruim

                E                             Péssimo
Precisamos de um programa que, lendo esses dados, nos mostre:

a quantidade de respostas Ótimo;
a média de idade das pessoas que responderam Ruim;
a porcentagem de respostas Péssimo e a maior idade que utilizou essa opção. */

        Scanner tcl = new Scanner (System.in); 
        int p, qtdBom, pessoa, idade, idadeM, somaIdade, qtdPessima, maiorIdade, percPessima;
        double media;
        System.out.println("    1 - A                             Ótimo\r\n" + //
                "\r\n" + //
                "               2 - B                             Bom\r\n" + //
                "\r\n" + //
                "               3 - C                             Regular\r\n" + //
                "\r\n" + //
                "               4 - D                             Ruim\r\n" + //
                "\r\n" + //
                "               5 - E                             Péssimo");
    
        qtdBom = 0;
        idadeM = 0;
        media = 0;
        somaIdade = 0;
        qtdPessima = 0;
        maiorIdade = -1;
        percPessima = 0;
        for (p = 1; p <= 5; p+=1) {
            System.out.print("Nº " + p + " ");
            pessoa = tcl.nextInt();
            System.out.print("IDADE Nº " + p + " ");
            idade = tcl.nextInt();
            
            if (pessoa == 1) {
                qtdBom += 1;
            }
            else if (pessoa == 4) {
                idadeM += 1;
                somaIdade = somaIdade + idade;
                media = somaIdade / idadeM;
            }
            else if (pessoa == 5) {
                qtdPessima += 1;
                percPessima = (qtdPessima * 100 / pessoa);
                if (idade > maiorIdade) {
                    maiorIdade = idade;
                }
            }
            
        }
        System.out.println("QUANTIDADE DE PESSOAS QUE ESCOLHERAM A OPÇÃO ÓTIMA[1]: " + qtdBom);
        System.out.println("MÉDIA DE PESSOAS QUE DERAM FEEDBACK DA OPÇÃP RUIM[4]: " + media);
        System.out.println("A MAIOR IDADE COM FEEDBACK PÉSSIMO[5] [" + maiorIdade + "] E A PORCENTAGEM DESSE FEEDBACK É: " + percPessima + "%");
        
        tcl.close();
    }
}
