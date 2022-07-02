import java.io.PrintStream;
import java.util.Scanner;

// Exercico 3

/**
 * Ler Dois número mostra natela o maior número Lido
 * Ibnore a condição de nímero iguais
 */
public class Ex03 {
    private static PrintStream printf;

    public static void main(String[] args) {
        
        int A, B;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o  primeiro número");
        A = ler.nextInt();

        System.out.println("Digite o  primeiro segundo");
        B = ler.nextInt();

        if (A > B )  System.out.printf("\n Maior número é");
        else          printf = System.out.printf("\n Não é Maior");

    }
}
