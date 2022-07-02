/*
5) Faça um programa em Java que realize uma pesquisa de rua.
O sistema precisará receber as opiniões das pessoas sobre vinhos.

As opiniões serão códigos de 1 até 4, distribuidos da seguinte maneira:
1 ---> vinho tinto
2 ---> vinho rosé
3 ---> vinho branco
4 ---> Não gosta de vinho

Quando o usuário digitar o número 0 (zero), o programa deverá encerrar a pesquisa.

Ao final da pesquisa, o programa deverá apresentar o relatório final, contendo o total de pessoas que gostam de vinho tinto, rosé, branco e que não gostam de vinho.
*/

import java.util.Scanner;
class Exer_05
{
  public static void main(String[] args)
  {
    Scanner leitura = new Scanner (System.in);
    int c1=0, c2=0, c3=0,c4=0;
    int voto=555; // forçar a entrada no loop

    while (voto != 0)
    {
         System.out.println("Pesquisa de rua");
         System.out.println("---------------");
         System.out.println("1: Vinho Tinto");
         System.out.println("2: Vinho Rosé");
         System.out.println("3: Vinho Branco");
         System.out.println("4: Não gosta de vinho");
         System.out.print("Digite seu voto <1/2/3/4>: ");
         voto = leitura.nextInt();
         switch(voto)
         {
            case 0: break;
            case 1: c1++; break;
            case 2: c2++; break;
            case 3: c3++; break;
            case 4: c4++; break;
            default: System.out.println("Voto Inválido!!\n");
         } // fim do switch
    } // fim do while
    System.out.println ("\n\n");
    System.out.println("Relatório Final da Pesquisa de rua");
    System.out.println("----------------------------------");
    System.out.println("Vinho Tinto ----------> " + c1 + " votos");
    System.out.println("Vinho Rosé -----------> " + c2 + " votos");
    System.out.println("Vinho Branco ---------> " + c3 + " votos");
    System.out.println("Não gosta de vinho ---> " + c4 + " votos");    
  } // fim void main
} // fim classe
