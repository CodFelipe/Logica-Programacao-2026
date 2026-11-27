import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;
        int soma = 0;

        System.out.println("Digite 10 números inteiros:");

         for (int i = 0; i < numeros.length; i++) {
            while (true) {
                System.out.print("Número " + (i + 1) + ": ");
                if (sc.hasNextInt()) {
                    numeros[i] = sc.nextInt();
                    break;
                } else {
                    System.out.println("Entrada inválida! Digite um número inteiro.");
                    sc.next(); 
                }
            }
        }
        System.out.println("\nNúmeros digitados:");
        for (int num : numeros) {
            System.out.print(num + " ");
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            soma += num;
        }
        System.out.println("\nPares: " + pares);
        System.out.println("Ímpares: " + impares);
        System.out.println("Soma: " + soma);

        sc.close();
    }
}
