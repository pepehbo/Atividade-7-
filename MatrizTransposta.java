import java.util.Scanner;

public class MatrizTransposta {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int[][] matrizTransposta = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        // Lendo os elementos da matriz original
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calculando a matriz transposta
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        // Imprimindo a matriz transposta
        System.out.println("\nMatriz Transposta:");
        for (int i = 0; i < matrizTransposta.length; i++) {
            for (int j = 0; j < matrizTransposta[i].length; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}