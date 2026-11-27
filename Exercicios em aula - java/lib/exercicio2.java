import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[5];
        double soma = 0;
        int aprovados = 0;
        int reprovados = 0;

        System.out.println("Digite 5 notas de alunos:");

        
        for (int i = 0; i < notas.length; i++) {
            while (true) {
                System.out.printf("Nota %d: ", i + 1);
                if (sc.hasNextDouble()) {
                    double nota = sc.nextDouble();
                    if (nota >= 0 && nota <= 10) {
                        notas[i] = nota;
                        soma += nota;
                        break; 
                    } else {
                        System.out.println(" Nota inválida!");
                    }
                } else {
                    System.out.println("Número inválido!");
                    sc.next(); 
                }
            }
        }

        
        for (double nota : notas) {
            if (nota >= 7) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        double media = soma / notas.length;

        System.out.printf("\n Média da turma: %.2f\n", media);
        System.out.println(" Aprovados: " + aprovados);
        System.out.println(" Reprovados: " + reprovados);

        sc.close();
    }
}
