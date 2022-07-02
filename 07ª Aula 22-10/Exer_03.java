
import java.util.Scanner;

public class Exer_03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        float A, B, media;
        
        A = 123;
        while (A < 0 || A > 10) { // nota 0 | 10, se for difernte vai ficar no lupin.

            System.out.println("Primeiro Nota...: ");
            A = ler.nextFloat();
        } 
        
        B = 123;
        while (B < 0 || B > 10) { // nota 0 | 10, se for difernte vai ficar no lupin.

            System.out.println("Segunda Nota...: ");
            B = ler.nextFloat();
        } 

        media = (A+B)/2;

        System.out.printf ("\n\n Sua média das notas é %.2f \n",media);

        
    }
}
