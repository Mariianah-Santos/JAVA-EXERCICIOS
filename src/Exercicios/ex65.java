package Exercicios;

public class ex65 {
    public static void main(String[] args) {
        /*4. A prefeitura da cidade A realizou um concurso para seleção de técnicos 
        em informática. O concurso consistiu em uma prova contendo dez questões 
        objetivas com cinco alternativas cada (A, B, C, D ou E). Ao todo, dez candidatos 
        fizeram as provas.
        Faça um programa em Java que leia uma matriz 10x10 contendo as respostas de 
        todos os candidatos. Cada linha da matriz conterá as respostas de um candidato 
        à cada uma das questões. O programa também deve ler um vetor de 10 posições 
        contendo o gabarito da prova. Ao final, o programa deve mostrar o total de 
        pontos obtidos por cada candidato. */
            char[][] respostas = new char[10][10];
            char[] gabarito = new char[10];
            
            // Lê o gabarito.
            System.out.println("--------------------------- GABARITO ---------------------------");
            for(int cont = 0; cont < gabarito.length; cont++) {
                System.out.printf("Questao %02d: ", cont+1);
                gabarito[cont] = System.console().readLine().charAt(0);
            }
            
            // Lê respostas para cada candidato.
            for(int candidato = 0; candidato < respostas.length; candidato++) {
                System.out.printf("---------------------- RESPOSTAS DO CANDIDATO %02d ----------------------\n", candidato+1);
                for(int questao = 0; questao < respostas[candidato].length; questao++) { 
                    System.out.printf("Questao %02d: ", questao+1);
                    respostas[candidato][questao] = System.console().readLine().charAt(0);
                }
            }
            
            // Calcula e mostra o total de pontos de cada candidato.
            System.out.println("---------------------- TOTAL DE PONTOS DE CADA CANDIDATO ----------------------");
            for(int candidato = 0; candidato < respostas.length; candidato++) {
                int pontos = 0;
                for(int questao = 0; questao < respostas[candidato].length; questao++) {
                    if(respostas[candidato][questao] == gabarito[questao])
                        pontos++;
                }
                System.out.printf("Candidato %02d = %d\n", candidato+1, pontos);
            }
        
        
    }
}
