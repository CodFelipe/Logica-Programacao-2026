import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salarios = new double[5];

        System.out.println("Digite os salários de 5 funcionários:");

          for (int i = 0; i < salarios.length; i++) {
            while (true) {
                System.out.printf("Salário do funcionário %d: R$ ", i + 1);
                if (sc.hasNextDouble()) {
                    double valor = sc.nextDouble();
                    if (valor >= 0) { 
                        salarios[i] = valor;
                        break;
                    } else {
                        System.out.println("Salário não pode ser negativo. Tente novamente.");
                    }
                } else {
                    System.out.println("Entrada inválida. Digite um número.");
                    sc.next(); 
                }
            }
        }

        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] < 2000) {
                salarios[i] += salarios[i] * 0.10;
            }
        }

        System.out.println("\nSalários atualizados:");
        for (int i = 0; i < salarios.length; i++) {
            System.out.printf("Funcionário %d: R$ %.2f%n", i + 1, salarios[i]);
        }

        sc.close();
    }
}

