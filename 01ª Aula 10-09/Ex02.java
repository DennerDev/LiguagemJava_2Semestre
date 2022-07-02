import java.util.Scanner;

// Exercicos 2
/**
 * Ler 2 números interios e informar se eles são diferentes
 */

public class Ex02 {
    public static void main(String[] args) {
        
        int A, B;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o  primeiro número");
        A = ler.nextInt();

        System.out.println("Digite o  primeiro segundo");
        B = ler.nextInt();

        if (A == B )  System.out.print("\n Iguais");
        else          System.out.print("\n São Diferentes");

    }
}
