package Exercicios;

import java.util.Scanner;

public class ex33 {
      public static void main(String[] args) {
        /*1. Escreva um algoritmo (utilizando escolha) e um programa em Java (utilizando switch) 
        que leiam três números inteiros que representam uma data com dia, mês e ano respectivamente. 
        O programa deve escrever esta data da seguinte forma:
        dia de nome do mês de ano */
        int dia_resposta, mes_res, ano_res;
        String nomeMes;
        Scanner tcl = new Scanner(System.in);
        System.out.print("DIA: ");
        dia_resposta = tcl.nextInt();
        System.out.print("MES: ");
        mes_res = tcl.nextInt();
        System.out.print("ANO: ");
        ano_res = tcl.nextInt();

        switch(mes_res) {
			case 1: nomeMes = "Janeiro"; break;
			case 2: nomeMes = "Fevereiro"; break;
			case 3: nomeMes = "Março"; break;
			case 4: nomeMes = "Abril"; break;
			case 5: nomeMes = "Maio"; break;
			case 6: nomeMes = "Junho"; break;
			case 7: nomeMes = "Julho"; break;
			case 8: nomeMes = "Agosto"; break;
			case 9: nomeMes = "Setembro"; break;
			case 10: nomeMes = "Outubro"; break;
			case 11: nomeMes = "Novembro"; break;
			case 12: nomeMes = "Dezembro"; break;
			default: nomeMes = "";
        }
        System.out.println(dia_resposta + " DE " + nomeMes + " DE " + ano_res);
        tcl.close();
    }
}
