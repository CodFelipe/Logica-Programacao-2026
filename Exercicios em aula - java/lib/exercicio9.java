import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        
        apresentar(nome);

        sc.close();
    }

    
    static void apresentar(String nome) {
        System.out.println("Olá, " + nome + "! Seja bem-vindo(a).");
    }
}