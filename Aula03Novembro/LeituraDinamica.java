package Aula03Novembro;

import java.util.Scanner;

public class LeituraDinamica {
Scanner entrada = new Scanner(System.in);
double[][] notas = new double[3][2]; // 3 Alunos, 2 Notas cada
double somaTotal = 0.0;             // Acumulador geral

// 1. LEITURA DINÂMICA VIA SCANNER
for (int i = 0; i < notas.length; i++) {
    for (int j = 0; j < notas[i].length; j++) {
        System.out.printf("Digite a nota %d do Aluno %d: ", (j + 1), (i + 1));
        notas[i][j] = entrada.nextDouble(); // Armazena na posição [i][j]
        somaTotal += notas[i][j];          // Acumula o valor lido
    }
}

    
}
