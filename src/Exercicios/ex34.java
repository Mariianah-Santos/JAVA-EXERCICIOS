package Exercicios;

import java.util.Scanner;

public class ex34 {
     /*2. O Detran deseja realizar uma vistoria geral nos veículos do estado. 
    Para isso, elaborou a seguinte distribuição, a partir do último dígito do número na placa do automóvel:
 Placas que terminam com 0 devem realizar a vistoria em Janeiro do próximo ano
 Placas que terminam com 1 devem realizar a vistoria em Fevereiro do próximo ano
 Placas que terminam com 2 devem realizar a vistoria em Março do próximo ano
 Placas que terminam com 3 devem realizar a vistoria em Abril do próximo ano
 Placas que terminam com 4 devem realizar a vistoria em Maio do próximo ano
 Placas que terminam com 5 devem realizar a vistoria em Junho do próximo ano
 Placas que terminam com 6 devem realizar a vistoria em Setembro deste ano
 Placas que terminam com 7 devem realizar a vistoria em Outubro deste ano
 Placas que terminam com 8 devem realizar a vistoria em Novembro deste ano
 Placas que terminam com 9 devem realizar a vistoria em Dezembro deste ano */
    public static void main (String[] args) {
        int numPlaca;
        Scanner tcl = new Scanner(System.in);
        System.out.print("QUAL O FINAL DA NUEMRO DA OLACA DO SEU CARRO? ");
        numPlaca = tcl.nextInt();
        switch (numPlaca) {
            
            case 0:
                System.out.println("a vistoria em JANEIRO do próximo ano");
            break;
            case 1:
                System.out.println("a vistoria em FEVEREIRO do próximo ano");
            break;
            case 2:
            System.out.println("a vistoria em MARÇO do próximo ano");
            break;
            case 3:
                System.out.println("a vistoria em ABRIL do próximo ano");
            break;
            case 4:
                System.out.println("a vistoria em MAIO do próximo ano");
            break;
            case 5:
                System.out.println("a vistoria em JUNHO do próximo ano");
            break;
            case 6:
                System.out.println("a vistoria em SETEMBRO do próximo ano");
            break;
            case 7:
                System.out.println("a vistoria em OUTUBRO do próximo ano");
            break;
            case 8:
                System.out.println("a vistoria em NOVEMBRO do próximo ano");
            break;
            case 9:
                System.out.println("a vistoria em DEZEMBRO do próximo ano");
            break;
            default:
                System.out.println("POR FAVOR DIGITE UM NUMERO VALIDO");
            break;

        }
        tcl.close();
    }
}
