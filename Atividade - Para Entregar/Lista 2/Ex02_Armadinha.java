// 2º Jogo Da Armadinha 

import java.util.*;


public class Ex02_Armadinha {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
    
        int magico, numero1,numero2, tent = 0;

        Random aleRandom = new Random();
        magico = aleRandom.nextInt(3);

        System.out.println("Descubra um numero de 1 a 100 digitando dois numeros até chegar no numero correto "+ magico);
        numero1 = ler.nextInt(); // Essa parte está errado (Tente arrumar)
        numero2 = ler.nextInt(); // Essa parte está errado (Tente arrumar)

        while ((numero1 != magico ) || (numero2 != magico)) 
        {
            System.out.println("Digite o Primeiro numero: ");
            numero1 = ler.nextInt(); 

            tent++;

            System.out.println("Digite o Segundo numero: ");
            numero2 = ler.nextInt(); 

            if (numero1 == magico && numero2 == magico) 
                System.out.println("\nACERTOU!!!\nVocê levou " + tent + " tentativas para acertar");

                else if ((numero1 <= magico && numero2 >= magico) || (numero1 >= magico && numero2 <= magico))
                System.out.println("\nSim está no primeiro ou no segundo numero");
                
                else  System.out.println("\nNão está entre esse numero, tente novamente\n");
        }
    }
}
