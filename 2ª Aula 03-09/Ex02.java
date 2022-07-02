import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner denner = new Scanner(System.in);

        int n1, n2, result;

        System.out.print("Digite o primeiro número: ");
        n1 = denner.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = denner.nextInt();

        result = n1 + n2;

        System.out.println("O Resultado é " + result);

    }
}