/** 6ª
 * Suponha que, durante a execução de um programa correspondente ao algoritmo a seguir, o usuário forneça o valor 6 como entrada. Neste caso, qual será a resposta apresentada pelo programa no vídeo?
*/ 

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int n, a, b;

        System.out.println("Número: ");
        n = ler.nextInt();

        a = 0;
        b = 1;

        while (n >= 0) {
          a = a + b;
          b = b + 2;
          n = n - 1;
        }
        System.out.print(a);
    }
}

// Respostas 49
