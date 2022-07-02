// 8ª Considera o progama abaixo:

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int v1, v2, v3;

        System.out.print (" Digite v1: "); v1 = ler.nextInt();
        System.out.print (" Digite v2: "); v2 = ler.nextInt();
        System.out.print (" Digite v3: "); v3 = ler.nextInt();

        System.out.print(v1 + " ");

        while (v3 > 1 ) {
            v1 = v1 * v2;
            v3 = v3 - 1;
            System.out.print (v1 + " ");
        }
    }
}

// Resposta  27
