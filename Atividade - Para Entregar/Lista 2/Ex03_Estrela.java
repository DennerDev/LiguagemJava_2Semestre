// 3º Jogo da Estrela 

import java.util.*;
 
public class Ex03_Estrela {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int magico, n1, teste, teste2, tent = 0 ;
         
        Random aleRandom = new Random();
        magico = aleRandom.nextInt(97) + 32;
  
        System.out.printf("Bem Vindo ao Jogo da Estrela,, tente achar o número entre <38/128> " + magico);
        n1 = ler.nextInt(); // Arrumar (ERRO)
        
        while (n1 != magico) {
            System.out.printf("\nDigite o número: ");
            n1 = ler.nextInt();
            
            tent++;

            teste = n1 - magico;
            teste2 = magico - n1;

            if (n1 == magico)
            System.out.printf("Acertou na sua tentativa de numero " + tent );

            else if ((teste >= 64) || (teste2 >=64))
            System.out.printf("*");

            else if ((teste >= 32) || (teste2 >=32) )
            System.out.printf("**");

            else if ((teste >= 16) || (teste2 >=16))
            System.out.printf("***");

            else if ((teste >= 8) || (teste2 >=8))
            System.out.printf("****");

            else if ((teste >= 4) || (teste2 >=4))
            System.out.printf("*****");

            else if ((teste >= 2) || (teste2 >=2))
            System.out.printf("******");

            else if ((teste >= 1) || (teste2 >=1))
            System.out.printf("*******");
        }
    }
}
