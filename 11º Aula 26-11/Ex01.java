import java.util.Scanner;

// Vetor

/**
 * Ler 1 vetor de 10 elementos interiros e mostrar vetro na tela
 */


public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int vet[] = new int[10];
        int i ;

        //ler o veotr de 10 elementos
        for (i=0 ; i<=9 ; i++) {
            System.out.printf("Digite o valor do Vetor [" +i+ "] = ");
            vet[i] = ler.nextInt();
        } 

        // Mostraro Vetor 
        for (i=0 ; i<=9; i++) 
        System.out.println(vet[i]);
    }
}
