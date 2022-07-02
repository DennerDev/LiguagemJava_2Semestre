// 7ª Considera o progama abaixo, desenvolvido em JAVA, o que será impresso na tela ?

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int i, x;

        x = 5;
        i = 1;

        while (i < 4) {
            x = x *  (-1);
            if (x < i )  x= x + i;
            i++;
        }
        System.out.println(x);
    }
}

// Resposta  -1
