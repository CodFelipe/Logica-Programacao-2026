import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][3];

        
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite os 3 números da " + (i + 1) + "ª linha:");
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        
        int maior = matriz[0][0];
        int menor = matriz[0][0];

        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("\nMaior: " + maior);
        System.out.println("Menor: " + menor);

        sc.close();
    }
}