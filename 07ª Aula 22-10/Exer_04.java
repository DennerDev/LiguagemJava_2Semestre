
/*
4) Faça um programa em Java que leia os votos de uma eleição presidencial.
Os votos serão códigos de 1 até 6, distribuidos da seguinte maneira:
1 = candidato 1 ---> Bolsonaro
2 = candidato 2 ---> Dilma
3 = candidato 3 ---> Boulos
4 = candidato 4 ---> Marina
5 = Voto em branco
6 = voto nulo

Quando o usuário digitar o número 0 (zero), o programa deverá encerrar a votação.

Ao final da eleição, o programa deverá apresentar o relatório final da eleição, contendo o total de votos de cada candidato, do voto nulo e do voto em branco.
*/
import java.util.Scanner;

class Exer_04
{
  public static void main(String[] args)
  {
    Scanner leitura = new Scanner (System.in);
    int c1=0, c2=0, c3=0, c4=0, c5=0, c6=0;
    int voto= 56;   //forçar a entrada no loop, diferente de zero

    while (voto != 0)
    {
      System.out.println("Sistema de Votação!");
      System.out.println("-------------------");
      System.out.println("1 -> Bolsonaro");
      System.out.println("2 -> Dilma");
      System.out.println("3 -> Boulos");
      System.out.println("4 -> Marina");
      System.out.println("5 -> Voto em branco");
      System.out.println("6 -> Voto nulo");
      System.out.print("Digite seu voto <1/2/3/4/5/6>...: ");
      voto = leitura.nextInt();
      switch (voto)
      {
          case 0: break;
          case 1: c1++; break;
          case 2: c2++; break;
          case 3: c3++; break;
          case 4: c4++; break;
          case 5: c5++; break;
          case 6: c6++; break;
          default: System.out.println("Voto inválido!! \n");
      }  // fim switch
    }   // fim while
    
    System.out.println ("\n\n");
    System.out.println("Relatório Final do Sistema de Votação!");
    System.out.println("--------------------------------------");
    System.out.println("Bolsonaro -------> "+ c1 + " votos ");
    System.out.println("Dilma -----------> "+ c2 + " votos ");
    System.out.println("Boulos ----------> "+ c3 + " votos ");
    System.out.println("Marina ----------> "+ c4 + " votos ");
    System.out.println("Voto em branco --> "+ c5 + " votos ");
    System.out.println("Voto nulo -------> "+ c6 + " votos ");

  }   // fim void main
}  // fim class
