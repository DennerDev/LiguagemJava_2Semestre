// 4ª Assinale a Alternativa que apresenta a saída da execução do progama abaixo

import java.util.Scanner;


public class Ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int i, a, b, f;

        a = 0;
        b = 1;
        f = 1;

        for (i=2 ; i<=6 ; i= i + 2) {
            f = a + b;
            a = b;
            b = f;

            System.out.print (b*10 + "  "); 
        }
    }
}

// Resposta: 10 20 30
