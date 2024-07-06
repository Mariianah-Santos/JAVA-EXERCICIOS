package Exercicios;

public class ex59 {
    public static void main(String[] args) {
        /*
         8. Em uma eleição presidencial existem quatro candidatos. 
         Os votos são informados por meio de um código. 
                            Os códigos utilizados são:

            1, 2, 3, 4                       Votos para os respectivos candidatos
                5                                          Voto nulo
                6                                       Voto em branco
            
            Faça um programa que calcule e mostre:

            o total de votos para cada candidato;
            o total de votos nulos;
            o total de votos em branco;
            a percentagem de votos nulos sobre o total de votos;
            a percentagem de votos em branco sobre o total de votos.

            Para finalizar o conjunto de votos, tem-se o valor zero e, 
            para códigos inválidos, o programa deverá mostrar uma mensagem.

         */


         /* criação das variaveis */
        int opcao, votoUm, votoDois, votoTres, votoQuatro, votoCinco, votoSeis;
        votoUm = 0;
        votoCinco = 0;
        votoDois = 0;
        votoQuatro = 0;
        votoSeis = 0;
        votoTres = 0;

        do {
            /* CANDIDATOS FICTICIOS */
            System.out.println("========== OPÇÃO DE CANDIDATOS ==========");
            System.out.println("[0] - SAIR");
            System.out.println("[1] - CANDIDATO MARIANO OLIVEIRA || PARTIDO PL");
            System.out.println("[2] - CANDIDATO AUGUSTO MONTEIRO || PARTIDO PT");
            System.out.println("[3] - CANDIDATO SIMONE TEXEIRA || PARTIDO PSDB");
            System.out.println("[4] - CANDIDATO ALICIA MONTE || PARTIDO PCB");
            System.out.println("[5] - VOTO NULO");
            System.out.println("[6] - VOTO EM BRANCO");
            System.out.print("ESCOLHA => ");
            opcao = Integer.parseInt(System.console().readLine());
            switch (opcao) {
                case 1:
                    System.out.println("OBRIGADA PELO SEU VOTO NO MARIANO OLIVERIA");
                    votoUm += 1;
                break;
                case 2:
                    System.out.println("OBRIGADO PELO SEU VOTO NO AUGUSTO MONTEIRO");
                    votoDois += 1;
                break;
                case 3:
                    System.out.println("OBRIGDA PELO SEU VOTO NA SIMONE TEXEIRA");
                    votoTres += 1;
                break;
                case 4:
                    System.out.println("OBRIGADA PELO SEU VOTO NA ALICIA MONTE");
                    votoQuatro += 1;
                break;
                case 5:
                    System.out.println("VOCE VOTOU NULO!! ORBIGADA PELO SEU VOTO");
                    votoCinco += 1;
                break;
                case 6:
                    System.out.println("VOCE VOTOU EM BRANCO!! OBRIGADA PELO SEU VOTO");
                    votoSeis += 1;
                break;
                default:
                    System.out.println("POR FAVOR DIGITE UM NUMERO DE CADIDATO VÁLIDO!!");
                break;
            }
        } while (opcao != 0);
        System.out.println("TOTAL DE VOTOS NO [1] - MARIANO OLIVERIA => " + votoUm);
        System.out.println("TOTAL DE VOTOS NO [2] - AUGUSTO MONTEIRO => " + votoDois);
        System.out.println("TOTAL DE VOTOS NA [3] - SIMONE TEXEIRA => " + votoTres);
        System.out.println("TOTAL DE VOTOS NA [4] - ALICIA MONTE => " + votoQuatro);
        System.out.println("TOTAL DE VOTOS [5] - NULOS => " + votoCinco);
        System.out.println("TOTAL DE VOTOS EM [6] - BRANCOS => " + votoSeis);
        




    }
}
