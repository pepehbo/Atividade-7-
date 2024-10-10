import java.util.Scanner;

public class MatrizIndicesParImpar {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        // Lendo os elementos da matriz
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Imprimindo os elementos nas posições desejadas
        System.out.println("\nElementos nas posições de linha par e coluna ímpar:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j += 2) { // Iniciamos em 1 e incrementamos de 2 em 2 para garantir colunas ímpares
                if (i % 2 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();

        scanner.close();
    }
}