// 3ª Considere o progama abaixo, assinale aalterativa que corresponde à saída apresente na tela.

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int i, k;
        k = 0;

        for (i=1 ; i<=3 ; i++) {
            k++;
            if (k*3 < 4) {
                k++;
                System.out.print (" Maçã ");
            }
            else System.out.print (" Pera ");

            if (k<2) System.out.print (" Melancia");
        }
    }
}

// Resposta Maçã Pera Pera