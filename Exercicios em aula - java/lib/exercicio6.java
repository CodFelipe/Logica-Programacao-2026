import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];
        int[] D = new int[10];

        
        System.out.println("Digite os 5 valores do vetor A:");
        for (int i = 0; i < 5; i++) {
            A[i] = scanner.nextInt();
        }

        
        System.out.println("Digite os 5 valores do vetor B:");
        for (int i = 0; i < 5; i++) {
            B[i] = scanner.nextInt();
        }

        
        int j = 0;
        for (int i = 0; i < 5; i++) {
            C[i] = A[i] + B[i];

            D[j] = A[i];
            D[j + 1] = B[i];
            j += 2;
        }

        
        System.out.print("C: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(C[i] + " ");
        }

        System.out.println(); 

        
        System.out.print("D: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(D[i] + " ");
        }

        scanner.close();
    }
}
