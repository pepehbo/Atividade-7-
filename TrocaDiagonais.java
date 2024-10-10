import java.util.Scanner;

public class TrocaDiagonais {
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

        // Trocando os elementos das diagonais
        int tamanho = matriz.length;
        for (int i = 0; i < tamanho; i++) {
            int temp = matriz[i][i]; // Armazena o elemento da diagonal principal
            matriz[i][i] = matriz[i][tamanho - i - 1]; // Substitui pelo elemento da diagonal secundária
            matriz[i][tamanho - i - 1] = temp; // Coloca o elemento da diagonal principal na diagonal secundária
        }

        // Imprimindo a matriz resultante
        System.out.println("\nMatriz com diagonais trocadas:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}