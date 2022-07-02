// 4º 


import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;   // sleep
class Main
{

   public static void limpatela()
   {
      char esc = 27;
      String clear = esc + "[2J"; //codigo ansi para limpar a tela
      System.out.print(clear);
   }


    public static void main(String[] args)
    {
       int x1,x2,x3,x4, n1, n2, n3, n4, tent=0, vidas=3,soma=0;
       Scanner leitura = new Scanner(System.in);
       Random  gerador = new Random();

       while (vidas > 0)
       {
       soma = 0;
       x1 = gerador.nextInt(51); //resto de 0 até 50.
       x2 = gerador.nextInt(51); //resto de 0 até 50.
       x3 = gerador.nextInt(51); //resto de 0 até 50.
       x4 = gerador.nextInt(51); //resto de 0 até 50.
       
       limpatela();
       System.out.println ("MEMORIZANDO......");
       System.out.println (x1 + "  " + x2+ "  " + x3 + "  " + x4);

      try{
            TimeUnit.SECONDS.sleep(6);
      }catch (InterruptedException e) { System.out.println("Erro");} 

      limpatela();
      System.out.println ("Agora é sua vez......");
      System.out.print ("Digite o 1º número: ");  n1 = leitura.nextInt();
      System.out.print ("Digite o 2º número: ");  n2 = leitura.nextInt();
      System.out.print ("Digite o 3º número: ");  n3 = leitura.nextInt();
      System.out.print ("Digite o 4º número: ");  n4 = leitura.nextInt();

      if (x1==n1) soma++;
      if (x2==n2) soma++;
      if (x3==n3) soma++;
      if (x4==n4) soma++;

      if (soma ==4)
          {
            vidas = vidas + 2;
            System.out.println ("Parabéns! Vc acertou TODOS os números");
            System.out.println ("Ganhou 2 vidas. Total= " +vidas+ " vidas");
            try{
            TimeUnit.SECONDS.sleep(6);
      }catch (InterruptedException e) { System.out.println("Erro");} 
          }
      else if (soma==0)
           {
             vidas = 0;
             System.out.println ("Xiiiii! Vc errou TODOS os números");
             System.out.println ("GAME OVER");            
           }
           else if (soma==3)               
               {
                 vidas++;
                 System.out.println ("Oba!Vc acertou 3 números e ganhou 1 vida");
                 System.out.println ("Total= " +vidas+ " vidas");
                 try{
            TimeUnit.SECONDS.sleep(6);
      }catch (InterruptedException e) { System.out.println("Erro");} 
          }

       } // fim do while     
  }  // fim do void main
} // fim da classe