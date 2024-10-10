import java.util.Scanner;

public class Matriz5x5 {
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

        // Imprimindo a matriz formatada
        System.out.println("\nMatriz informada:");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.printf("%4d ", elemento); // Formatando com 4 espaços
            }
            System.out.println();
        }

        scanner.close();
    }
}