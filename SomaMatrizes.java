import java.util.Scanner;

public class SomaMatrizes {
    public static void main(String[] args) {
        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];
        int[][] matrizSoma = new int[2][2];
        Scanner scanner = new Scanner(System.in);

        // Lendo os elementos da matriz A
        System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Lendo os elementos da matriz B
        System.out.println("Digite os elementos da matriz B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Calculando a soma das matrizes
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Imprimindo a matriz soma
        System.out.println("\nMatriz resultante da soma:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizSoma[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}