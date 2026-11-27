import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] alunos = new String[4];
        String[] disciplinas = {"Lógica", "Banco de Dados", "Redes"};
        double[][] notas = new double[4][3];
        double[] mediasAlunos = new double[4];

       
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "º aluno: ");
            alunos[i] = sc.next();

            for (int j = 0; j < 3; j++) {
                System.out.print("Digite a nota de " + disciplinas[j] + " para " + alunos[i] + ": ");
                notas[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        int indiceMaiorMedia = 0;

        
        for (int i = 0; i < 4; i++) {
            double soma = 0;
            for (int j = 0; j < 3; j++) {
                soma += notas[i][j];
            }
            mediasAlunos[i] = soma / 3;

            String situacao;
            if (mediasAlunos[i] >= 7) {
                situacao = "Aprovado";
            } else if (mediasAlunos[i] >= 5) {
                situacao = "Recuperação";
            } else {
                situacao = "Reprovado";
            }

            System.out.printf("%s: %.2f - %s\n", alunos[i], mediasAlunos[i], situacao);

            if (mediasAlunos[i] > mediasAlunos[indiceMaiorMedia]) {
                indiceMaiorMedia = i;
            }
        }

        System.out.println(); 

        
        for (int j = 0; j < 3; j++) {
            double somaDisciplina = 0;
            for (int i = 0; i < 4; i++) {
                somaDisciplina += notas[i][j];
            }
            double mediaDisciplina = somaDisciplina / 4;
            System.out.printf("%s: %.2f\n", disciplinas[j], mediaDisciplina);
        }

    
        System.out.printf("Maior média: %s (%.2f)\n", alunos[indiceMaiorMedia], mediasAlunos[indiceMaiorMedia]);

        sc.close();
    }
}