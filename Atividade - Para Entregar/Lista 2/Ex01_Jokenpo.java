// 1º Jogo da Jokenpô  (Feito)

import java.util.*;

public class Ex01_Jokenpo {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int magico, numero1;
        char sn = 's';

        Random aleRandom = new Random();
        magico = aleRandom.nextInt(3);

        // System.out.println(magico);
        
        System.out.printf("\nJokenpô ");

        while (sn == 's' || sn == 'S') {
          System.out.printf("\nHora de Jogar!! ");

          System.out.printf("\nRegras do Jogo \n0 será o pedra, 1 para o papel e o 2 a tesoura! ");

          System.out.printf("\nEssa jogo será contra a máquina, Digite os numeros <0/1/2>: ");
          numero1 = ler.nextInt();

          if (numero1 == magico)
              System.out.println("\nEmpataram Ambos jogaram o mesmo número " + magico);

            else if (numero1 != 1 && numero1 != 0 && numero1 != 2)
            System.out.println("\nOpção invalida somente <0/1/2> ");  

            else if ((numero1 == 0 && magico == 2) || (numero1 == 1 && magico == 0 ) || (numero1 == 2 && magico == 1))
              System.out.println("\nVocê ganhou da maquinaa maquina jogou " + magico);
            
            else 
               System.out.println("\nComputadore venceu, ele jogou: " + magico); 
               
            System.out.println("\nVocê quer jagar novamente? Digite <S/s> para continuar \nou aperte qualquer outra tecla para sair ");
            sn = ler.next().charAt(0);
            
            if (sn != 's' && sn!= 'S') {
                System.out.println("\nObrigado por jogar, Volte sempre! ");
            }
        }
    }
}
