// 5ª Analise o progama abaixo.
// Caso o usuário digite o valor 5 para a varíavel B, os valores que serão escritos para
// A e para, serão repectivamento:

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int A=2, B;
        System.out.print("Números: ");

        B = ler.nextInt();

        while (A <= 30) {
            B = B + 2;
            if (B > 20 ) B--;
            A = A+B;
        }
        System.out.print("\n Valor de A: " + A);
        System.out.print("\n Valor de B: " + B);
    }
}

// Valor de A: 42 
// Valor de B: 13
