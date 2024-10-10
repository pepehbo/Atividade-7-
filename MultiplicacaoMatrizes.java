import java.util.Scanner;

public class MultiplicacaoMatrizes {
    public static void main(String[] args) {
        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];
        int[][] matrizProduto = new int[2][2];
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

        // Calculando o produto das matrizes
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizProduto[i][j] = matrizA[i][0] * matrizB[0][j] + matrizA[i][1] * matrizB[1][j];
            }
        }

        // Imprimindo a matriz produto
        System.out.println("\nMatriz resultante da multiplicação:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizProduto[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}