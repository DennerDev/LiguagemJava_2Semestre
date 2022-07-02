// 9) Ler um número inteiro. Mostrar a TABUADA do número lido na tela.

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
    int N, contador;

    Scanner ler = new Scanner (System.in);

    System.out.print ("Digite um número referente a tabuada da qual você desaja ver : ");
    N = ler.nextInt();

    for (contador = 1 ;  contador <=10  ; contador++)
    System.out.println  (N + " x " +  contador + " = " + N*contador);
    }
}
