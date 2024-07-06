package Exercicios;

public class ex54 {
    public static void main(String[] args) {
        /*3. A empresa JS Recrutamento e Seleção Ltda. faz recrutamento e seleção 
        de funcionários para várias empresas em diversos ramos de atuação.
         Para facilitar o trabalho de identificação do perfil dos candidatos 
         que se inscrevem para as vagas, resolveu fazer um programa para registrar 
         alguns dados para obter as informações a seguir:
a. número de candidatos do sexo feminino;
b. número de candidatos do sexo masculino;
c. idade média dos homens;
d. idade média das mulheres com experiência
Faça um programa para calcular as informações solicitadas anteriormente, sabendo que 
para cada candidato devem ser informados sexo (M ou F), idade e tempo de experiência
profissional (em anos). Também considere que a cada iteração deverá ser perguntado ao 
usuário se deseja cadastrar outro candidato ou não. Quando a resposta for negativa, 
os resultados deverão ser apresentados. */

        String resp = "", sexo;
        int idade, qtdMulher = 0, qtdHomem = 0;


        while (resp != "S") {
            System.out.println("======== RELATORIO ==========");
            System.out.print("SEXO [M/F] ");
            sexo = System.console().readLine();
            System.out.print("IDADE: ");
            idade = Integer.parseInt(System.console().readLine());
            System.out.print("DESEJA CADASTRA OUTRO CANDIDATO? [S/N] ");
            resp = System.console().readLine();
            if (sexo == "F") {
                qtdMulher += 1;
            } if (sexo == "M") {
                qtdHomem += 1;
            }

        }
    }
}
