// Exercicio 5 do PFD para entregar  (Concluido)

import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner ler = new Scanner (System.in);
    float sal;
    System.out.print("Digite seu salário: ");
    sal = ler.nextFloat();
    if (sal <= 2000)        System.out.printf ("Ganhou 50%% de aumento: %.2f reais " , (sal*1.50));
    else if (sal <= 5000)   System.out.printf ("Ganhou 20%% de aumento: %.2f reais " , (sal*1.20));
         else               System.out.printf ("Ganhou 10%% de aumento: %.2f reais " , (sal*1.10));    
  }
}
