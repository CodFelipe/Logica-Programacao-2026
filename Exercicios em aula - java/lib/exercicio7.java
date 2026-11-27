import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhas = 3; 
        int dias = 4;
        int[][] vendas = new int[linhas][dias];

        System.out.println("Digite os valores da matriz de vendas:");

        
        int i = 0;
        while (i < linhas) {
            int j = 0;
            while (j < dias) {
                vendas[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }

        int maiorTotal = 0;
        int diaMaior = 0;

        
        int j = 0;
        while (j < dias) {
            int somaDia = 0;
            i = 0;
            while (i < linhas) {
                somaDia += vendas[i][j];
                i++;
            }

            System.out.println("Dia " + (j + 1) + ": " + somaDia);

            if (j == 0 || somaDia > maiorTotal) {
                maiorTotal = somaDia;
                diaMaior = j + 1;
            }
            j++;
        }

        System.out.println("Maior total: Dia " + diaMaior + " (" + maiorTotal + ")");

        sc.close();
    }
}
