// 2º Uma sala de auala passui 15 alunos 
// Ler as notas dos 15 alunos.Informe a  quantidade de alunos, aprovados, sabendo que a média para // // aprvação é 6

/*
2) Uma sala de aula possui 15 alunos.
   Ler as notas dos 15 alunos.
   Informe a qtd de alunos aprovados, sabendo que a média para aprovação é 6 (seis).
*/   

import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner ler = new Scanner (System.in);
    float vet[] = new float[15];
    int i, qtd=0;

    for (i=0 ; i<=14 ; i++)
    {
      System.out.print ("Digite vet[" + i + "]= ");
      vet[i] = ler.nextFloat();
    }

    for (i=0 ; i<=14 ; i++)
     if (vet[i] >= 6 ) qtd++;


    System.out.println("\nQtd de alunos aprovados: " + qtd);
  }
}