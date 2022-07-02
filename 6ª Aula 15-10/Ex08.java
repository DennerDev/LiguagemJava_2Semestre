// 8 Leia um número Inteiro (N). Escrever od número de 0 até N na tela.

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        int contador, N;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número......: ");
        N = ler.nextInt();

        if (N < 0)        System.out.println("Número inválido ");
        else         for (contador = 0  ; contador <=N  ; contador++)
                          System.out.print (contador + "   ");
        
    }
}
