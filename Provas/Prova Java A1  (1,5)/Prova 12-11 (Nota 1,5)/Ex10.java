// 10ª Analise o seguinte progama abaixo.
/**
 * Considere qoe os valores lidos para x1,x2, e x3 tenha, sido, repectivamente: 3, 4 e 3.
 * É correto que afirmar que o valor impresso ao final da execução do algoritmo é igual a:
 */

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in );

        int x1, x2, x3, i;

        System.out.print("Digite x1: "); x1 = ler.nextInt();
        System.out.print("Digite x2: "); x2 = ler.nextInt();
        System.out.print("Digite x3: "); x3 = ler.nextInt();

        for (i=1 ; i <= x1 ; i++) {
            x2 = x1 + x3;
            x3 = x1 - x2;
        }
        System.out.print(x1+x2);
    }
}

// Resposta 9 
