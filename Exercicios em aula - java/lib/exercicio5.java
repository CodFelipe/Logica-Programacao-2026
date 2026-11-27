import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[6];
        int i = 0;

        System.out.print("Digite os 6 nomes: "); 
        
        while (i < 6) {
            nomes[i] = sc.next();
            i++;
        }

        System.out.print("Buscar qual nome? ");
        String busca = sc.next();

        boolean achou = false;
        int qtd = 0;
        i = 0; 

        
        while (i < 6) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                System.out.println("Encontrado na posição " + (i + 1));
                achou = true;
                qtd++;
            }
            i++;
        }

        if (achou) {
            System.out.println(busca + " aparece " + qtd + " vez(es).");
        } else {
            System.out.println(busca + " não foi encontrado.");
        }

        sc.close();
    }
}
