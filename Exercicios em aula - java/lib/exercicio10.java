import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();

        
        double media = calcularMedia(nota1, nota2);
        String resultado = situacao(media);

        
        System.out.printf("Média: %.2f\n", media);
        System.out.println("Situação: " + resultado);

        sc.close();
    }

    
    static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    
    static String situacao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else {
            return "Em recuperação";
        }
    }
}