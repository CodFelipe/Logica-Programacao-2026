import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        double[] temperaturas = new double[7];
        double soma = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Digite a temperatura de " + dias[i] + ": ");
            temperaturas[i] = sc.nextDouble();
            soma += temperaturas[i];
        }

        double media = soma / 7;
        System.out.println("\nDias acima da média:");
        int indiceMaisQuente = 0;

        for (int i = 0; i < 7; i++) {
            if (temperaturas[i] > media) {
                System.out.printf(" %s (%.1f °C)\n", dias[i], temperaturas[i]);
            }
            if (temperaturas[i] > temperaturas[indiceMaisQuente]) {
                indiceMaisQuente = i;
            }
        }

        System.out.printf("Dia mais quente: %s (%.1f °C)\n", dias[indiceMaisQuente], temperaturas[indiceMaisQuente]);
        sc.close();
    }
}