package Aula03Novembro;


import java.util.Scanner;

public class SistemaVendas {

    // ==================================================
    // INTEGRANTE 1 - ARQUITETO DE LEITURA E VALIDACAO
    // ==================================================

    static double[][] vendas = new double[4][4];

    static String[] filiais = {
        "Filial 1", "Filial 2", "Filial 3", "Filial 4"
    };

    static String[] trimestres = {
        "Q1", "Q2", "Q3", "Q4"
    };

    static Scanner scanner = new Scanner(System.in);

    public static void lerVendas() {

        System.out.println("=== CADASTRO DE VENDAS ===");

        // Percorre as 4 filiais
        for (int i = 0; i < 4; i++) {

            System.out.println("\n" + filiais[i]);

            // Percorre os 4 trimestres
            for (int j = 0; j < 4; j++) {

                double valor;

                // Repete enquanto o valor for invalido
                do {
                    System.out.print(trimestres[j] + ": R$ ");

                    // Verifica se a entrada e numerica
                    if (scanner.hasNextDouble()) {
                        valor = scanner.nextDouble();
                    } else {
                        System.out.println("Digite um numero valido!");
                        scanner.next();
                        valor = -1;
                        continue;
                    }

                    if (valor < 0) {
                        System.out.println("Valor negativo nao permitido!");
                    }

                } while (valor < 0);

                vendas[i][j] = valor;
            }
        }
    }

    // ==================================================
    // INTEGRANTE 2 - ENGENHEIRO DE PROCESSAMENTO E TOTAIS
    // ==================================================

    static double[] totalFiliais = new double[4];
    static double[] totalTrimestres = new double[4];
    static double mediaGeral;
    static double totalRede;

    public static void calcularTotais() {

        // SOMA POR LINHA: total anual de cada filial
        for (int i = 0; i < 4; i++) {

            totalFiliais[i] = 0;

            for (int j = 0; j < 4; j++) {
                totalFiliais[i] += vendas[i][j];
            }
        }

        // SOMA POR COLUNA: total de cada trimestre
        for (int j = 0; j < 4; j++) {

            totalTrimestres[j] = 0;

            for (int i = 0; i < 4; i++) {
                totalTrimestres[j] += vendas[i][j];
            }
        }

        // Calcula o faturamento total da rede
        totalRede = 0;

        for (int i = 0; i < 4; i++) {
            totalRede += totalFiliais[i];
        }

        // Media dos 16 valores da matriz
        mediaGeral = totalRede / 16;
    }

    // ==================================================
    // INTEGRANTE 3 - ANALISTA DE DESTAQUES E RELATORIO
    // ==================================================

    public static void gerarRelatorio() {

        int melhorFilial = 0;
        int piorTrimestre = 0;

        // Busca a filial com maior faturamento anual
        for (int i = 1; i < 4; i++) {
            if (totalFiliais[i] > totalFiliais[melhorFilial]) {
                melhorFilial = i;
            }
        }

        // Busca o trimestre com menor faturamento global
        for (int j = 1; j < 4; j++) {
            if (totalTrimestres[j] < totalTrimestres[piorTrimestre]) {
                piorTrimestre = j;
            }
        }

        // RELATORIO EXECUTIVO
        System.out.println("\n====================================");
        System.out.println("       RELATORIO DE VENDAS");
        System.out.println("====================================");

        System.out.println("\nTOTAL ANUAL POR FILIAL:");

        for (int i = 0; i < 4; i++) {
            System.out.printf("%s: R$ %.2f%n",
                    filiais[i], totalFiliais[i]);
        }

        System.out.println("\nTOTAL GLOBAL POR TRIMESTRE:");

        for (int j = 0; j < 4; j++) {
            System.out.printf("%s: R$ %.2f%n",
                    trimestres[j], totalTrimestres[j]);
        }

        System.out.println("\n====================================");
        System.out.println("       INDICADORES DA REDE");
        System.out.println("====================================");

        System.out.printf("Faturamento total: R$ %.2f%n", totalRede);
        System.out.printf("Media geral: R$ %.2f%n", mediaGeral);

        System.out.printf("Filial campea: %s (R$ %.2f)%n",
                filiais[melhorFilial], totalFiliais[melhorFilial]);

        System.out.printf("Trimestre critico: %s (R$ %.2f)%n",
                trimestres[piorTrimestre],
                totalTrimestres[piorTrimestre]);
    }

    // ==================================================
    // METODO PRINCIPAL - INTEGRACAO DOS 3 INTEGRANTES
    // ==================================================

    public static void main(String[] args) {

        lerVendas();       // Integrante 1
        calcularTotais();  // Integrante 2
        gerarRelatorio();  // Integrante 3

        scanner.close();
    }
}
